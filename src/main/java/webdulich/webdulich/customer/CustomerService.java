package webdulich.webdulich.customer;

import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import webdulich.webdulich.form.LoginForm;
import webdulich.webdulich.form.ResponseLogin;
import webdulich.webdulich.form.ResponseSignup;
import webdulich.webdulich.utils.AES;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> gCustomers() {
        return customerRepository.findAll();
    }

    public ResponseEntity<ResponseSignup> addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(customer.getEmail());

        if(customerOptional.isPresent()){            
            return new ResponseEntity<ResponseSignup>(HttpStatus.CONFLICT);
        }
        customerRepository.save(customer);
        return new ResponseEntity<ResponseSignup>(new ResponseSignup(customer),HttpStatus.OK);
    }
    public ResponseEntity<ResponseLogin> login(LoginForm loginForm) {
        Customer customer = customerRepository.login(loginForm.getUsername(), loginForm.getPwd());

        if(customer != null){
            String authKey = AES.encrypt(loginForm.getUsername() + " " + loginForm.getPwd(), "secret");
            
            System.out.print(AES.decrypt(authKey, "secret"));
            ResponseLogin rs = new ResponseLogin("authkey", HttpStatus.ACCEPTED);
            return new ResponseEntity<ResponseLogin>(rs, HttpStatus.OK);
        }
        return new ResponseEntity<ResponseLogin>(HttpStatus.NOT_FOUND);
    }
}
