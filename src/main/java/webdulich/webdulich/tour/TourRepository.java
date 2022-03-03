package webdulich.webdulich.tour;

import java.lang.StackWalker.Option;

import com.google.common.base.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer>{
    Optional<Tour> findByName(String name);
    Tour findById(int id);
}