package webdulich.webdulich.customer;

import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

    public Optional<Customer> findByName(String name){
        return customerRepository.findByNameOrUsername(name, name);
    }
}
