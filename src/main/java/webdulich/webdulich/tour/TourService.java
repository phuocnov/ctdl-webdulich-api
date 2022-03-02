package webdulich.webdulich.tour;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<Tour> gTour(){
        return tourRepository.findAll();
    }

    public ResponseEntity<Tour> createTour(Tour tour){
        tourRepository.save(tour);
        return new ResponseEntity<Tour>(tour, HttpStatus.OK);
    }
}
