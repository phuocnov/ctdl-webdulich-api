package webdulich.webdulich.customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public List<Customer> gCustomers() {
        return (List<Customer>) List.of(
                new Customer(12L, "Nguyen Huu Phuoc", 21, LocalDate.of(2001, Month.DECEMBER, 5),
                        "phuocnguyenhuu806@gmail.com"));
    }
}
