package webdulich.webdulich.cloudinary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<PhotoModel, Long>{
    
}
