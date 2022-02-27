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

import lombok.*;


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
        Optional<Customer> customerOptional = customerRepository.findByEmail(customer.getEmail());

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
            ResponseLogin rs = new ResponseLogin(authKey, HttpStatus.ACCEPTED);
            return new ResponseEntity<ResponseLogin>(rs, HttpStatus.OK);
        }
        return new ResponseEntity<ResponseLogin>(HttpStatus.NOT_FOUND);
    }

    public boolean authCheck(String authKey){
        String decodedString = AES.decrypt(authKey, "secret");   
        String[] rs = decodedString.split(" ");
        
        Customer customer = customerRepository.login(rs[0], rs[1]);
        if(customer != null) return true;
        else return false;
    }
}
