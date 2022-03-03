package webdulich.webdulich.customer;

import java.time.LocalDate;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webdulich.webdulich.tour.Tour;
import webdulich.webdulich.tour.TourRepository;
import webdulich.webdulich.toudetail.TourDetails;
@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Autowired
    TourRepository tourRepository;
    @GetMapping
    // @PreAuthorize("hasRole('ADMIN')")
    public List<Customer> gCustomers() {
        return customerService.gCustomers();
    }
    
    @PutMapping
    public void updateCustomerProfile(){
        
    }
}
