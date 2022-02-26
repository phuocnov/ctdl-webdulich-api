package webdulich.webdulich.tour;

import com.google.common.base.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer>{
    Optional<Tour> findByName(String name);
    Tour findByID(int ID);
}
