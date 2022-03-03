package webdulich.webdulich.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import webdulich.webdulich.customer.CustomerService;

public class CloudinaryService {
    private final Cloudinary cloudinary = Singleton.getCloudinary();
    
}
