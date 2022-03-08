package webdulich.webdulich.tour;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webdulich.webdulich.toudetail.*;

@RestController
@RequestMapping(path = "api/v1/tour")
public class TourController {
    @Autowired
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }   

    @GetMapping
    public List<Tour> gTour(){
        return tourService.gTour();
    }
    
    @PostMapping(path = "/create_tour")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Tour> createTour(@RequestBody Tour tour){
        System.out.println(tour);
        return tourService.createTour(tour);
    }
}
