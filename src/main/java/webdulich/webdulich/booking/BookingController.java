package webdulich.webdulich.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webdulich.webdulich.customer.Customer;
import webdulich.webdulich.customer.CustomerService;
import webdulich.webdulich.payload.BookingDto;
import webdulich.webdulich.tour.Tour;
import webdulich.webdulich.tour.TourService;

@RestController
@RequestMapping(path = "api/v1/booking")
public class BookingController {
    @Autowired
    private final BookingService bookingService;
    @Autowired
    private final CustomerService customerService;
    @Autowired
    private final TourService tourService;

    public BookingController(BookingService bookingService, CustomerService customerService, TourService tourService){
        this.bookingService = bookingService;
        this.customerService = customerService;
        this.tourService = tourService;
    }

    @GetMapping
    public List<Booking> gBooking(){
        return bookingService.gBookings();
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Booking> book(@RequestBody BookingDto params){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Customer customer = customerService.findByUsername(userDetails.getUsername()).get();
        Tour tour = tourService.findById(params.getTourId()).get();


        System.out.println(customer.toString());
        System.out.println(tour.toString());


        Booking booking = new Booking(customer, tour, params.getPhoneNumber());
        return bookingService.creteBooking(booking);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Booking> getTourById(@PathVariable(name = "id") long id) {
        Optional<Booking> booking = bookingService.findById(id);
        return new ResponseEntity<Booking>(booking.get(), HttpStatus.OK);
    }
}
