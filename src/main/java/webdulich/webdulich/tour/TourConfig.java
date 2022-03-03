package webdulich.webdulich.tour;

import java.time.LocalDate;
import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import webdulich.webdulich.toudetail.TourDetails;

@Configuration
public class TourConfig {
    // @Bean
    CommandLineRunner commandLineRunner(TourRepository tourRepository){
        return args->{
            Tour tour0 = new Tour(
                "name",
                "tour",
                "schedule",
                LocalDate.of(2022, 3, 3),
                LocalDate.of(2022, 3, 6),
                3000000,
                "short description",
                new TourDetails("schedule", "service", "note")
            );
            
            tourRepository.saveAll(
                List.of(tour0)
            );
        };
    }
}