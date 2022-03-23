package webdulich.webdulich.customer;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Local;
import webdulich.webdulich.tour.Tour;
import webdulich.webdulich.tour.TourRepository;
import webdulich.webdulich.tour.TourService;
import webdulich.webdulich.payload.SignupDao;
import webdulich.webdulich.toudetail.TourDetails;

import webdulich.webdulich.tour.TourController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Customer> gCustomers() {
        return customerService.gCustomers();
    }
    
    @PutMapping
    public void updateCustomerProfile(){
        
    }

    @GetMapping(path = "/user-info")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> userInfo() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Customer> findCustomers(String name){
        return customerService.findByName(name);
    }
}
