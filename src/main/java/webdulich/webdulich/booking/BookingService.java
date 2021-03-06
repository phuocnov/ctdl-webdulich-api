package webdulich.webdulich.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> gBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findById(Long id){
        return bookingRepository.findById(id);
    }

    public ResponseEntity<Booking> creteBooking(Booking booking) {
        bookingRepository.save(booking);
        return new ResponseEntity<Booking>(booking, HttpStatus.OK);
    }
}
