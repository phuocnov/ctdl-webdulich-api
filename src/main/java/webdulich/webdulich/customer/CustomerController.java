package webdulich.webdulich.customer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webdulich.webdulich.form.LoginForm;
import webdulich.webdulich.form.ResponseLogin;
import webdulich.webdulich.form.ResponseSignup;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> gCustomers() {
        return customerService.gCustomers();
    }

    @RequestMapping(path = "/auth/signup")
    @PostMapping
    public ResponseEntity<ResponseSignup> resgisterNewCustomer(@RequestBody Customer customer){
        return customerService.addNewCustomer(customer);
    }

    @PostMapping(value = "/auth/login")
    public ResponseEntity<ResponseLogin> loginCustomer(@RequestBody LoginForm loginForm) throws Exception{
        return customerService.login(loginForm);
    }

    @PutMapping
    public void updateCustomerProfile(){

    }
}
