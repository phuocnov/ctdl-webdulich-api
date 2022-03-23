package webdulich.webdulich.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByUsernameOrEmail(String username, String email);
    Optional<Customer> findByUsername(String username);
    Optional<Customer> findByNameOrUsername(String name, String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}