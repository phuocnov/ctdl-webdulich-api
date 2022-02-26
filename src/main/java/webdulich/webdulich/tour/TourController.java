package webdulich.webdulich.tour;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/tour")
public class TourController {
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }   

    @GetMapping
    public List<Tour> gTour(){
        return tourService.gTour();
    }
    
    @RequestMapping(path = "/admin/create_tour")
    public ResponseEntity<Tour> createTour(@RequestBody Tour tour){
        return tourService.createTour(tour);
    }
}
