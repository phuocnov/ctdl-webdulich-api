package webdulich.webdulich.customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args ->{
            Customer phuoc = new Customer(
                1,
                "Nguyen Huu Phuoc",
                LocalDate.of(2001, Month.DECEMBER, 5),
                "phuocnguyenhuu806@gmail.com",
                "phuocnov",
                "123456"
            );
            Customer alex = new Customer(
                2,
                "Alex",
                LocalDate.of(2001, Month.DECEMBER, 5),
                "alex@gmail.com",
                "alexaccount",
                "123456"
            );

            repository.saveAll(
                List.of(phuoc, alex)
            );
        };
    }
}
