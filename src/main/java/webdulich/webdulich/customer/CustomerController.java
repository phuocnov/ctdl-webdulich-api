package webdulich.webdulich.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping
    public void resgisterNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }
    @PutMapping
    public void updateCustomerProfile(){
        
    }
}
