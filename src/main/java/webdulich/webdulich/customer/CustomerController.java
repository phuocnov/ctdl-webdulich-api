package webdulich.webdulich.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = new CustomerService();
    }

    @GetMapping
    public List<Customer> gCustomers() {
        return customerService.gCustomers();
    }

    @PostMapping
    public Customer pCustomer(@RequestBody Customer body) {
        
        return body;
    }
}
