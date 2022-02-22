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

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(customer.getEmail());

        if(customerOptional.isPresent()){
            throw new IllegalArgumentException("email has taken!");
        }
        customerRepository.save(customer);
    }
}
