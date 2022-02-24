package webdulich.webdulich.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByName(String name);
    Customer findByID(int id);

    @Query(value = "SELECT c FROM customer c WHERE c.email = :email")
    Optional<Customer> findCustomerByEmail(@Param("email") String email);

    @Query(value = "SELECT c FROM customer c where c.username = :username and c.pwd = :pwd")
    Customer login(@Param("username") String username, @Param("pwd")String pwd);
}