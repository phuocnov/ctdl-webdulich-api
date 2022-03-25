package webdulich.webdulich.customer;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> gCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findByName(String name){
        return customerRepository.findByName(name);
    }

    public Optional<Customer> findById(long id){
        return customerRepository.findById((int) id);
    }

    public Optional<Customer> findByUsername(String username){
        return customerRepository.findByName(username);
    }
}
