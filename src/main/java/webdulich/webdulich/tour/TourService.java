package webdulich.webdulich.tour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourService {
    @Autowired
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
    
    public Optional<Tour> findById(long id) {
        return tourRepository.findById(id);
    }
}
