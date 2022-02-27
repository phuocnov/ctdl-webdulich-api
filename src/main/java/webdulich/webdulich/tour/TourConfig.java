package webdulich.webdulich.tour;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TourConfig {
    // @Bean
    // CommandLineRunner commandLineRunner(TourRepository tourRepository){
    //     return args->{
    //         Tour tour0 = new Tour(
    //             1,
    //             "Du lịch Đà Lạt - QUÊ Garden - Đà Lạt View Coffee - Kim Ngân Hills Resort từ Sài Gòn",
    //             "	Đà Lạt  - QUÊ Garden - Đà Lạt View Coffe -  Kim Ngân Hills Resort",
    //             3,
    //             2,
    //             "17,19,23/02; 02,09,16,23/03; 04,13,18,20/04",
    //             LocalDate.parse("2022-03-26"),
    //             LocalDate.parse("2022-03-29"),
    //             3600000,
    //             "Du lịch Đà Nẵng - Huế - Thánh Địa La Vang - Động Phong Phong Nha từ Sài Gòn 2022  - Du lịch Miền Trung - Tour Du lịch Đà Nẵng được thiên nhiên đặc biệt ưu đãi, mảnh đất miền Trung đẹp với nhiều dãy núi hùng vỹ xanh rì, những bờ biển cát trắng mịn thoai thoải và những dòng sông trong vắt thơ mộng. Không những vậy, trên con đường di sản miền Trung cùng Du Lịch Việt, du khách còn được thưởng ngoạn những di sản thế giới cuả Việt Nam đó là Phố cổ Hội An – nơi bến cảng một thời sầm uất nhất Đông Dương, quần thể di tích Cố Đô Huế với hệ thống đền đài lăng tẩm nguy nga tráng lệ và Động Phong Nha với nhiều hang động kì bí của tạo hóa."
    //         );
    //         Tour tour1 = new Tour(
    //             1,
    //             "Du lịch Đà Nẵng - Huế - Thánh Địa La Vang - Động Phong Phong Nha từ Sài Gòn 2022",
    //             "Đà Nẵng - Bà Nà - Hội An - Huế - Thánh Địa La Vang - Động Phong Nha",
    //             5,
    //             4,
    //             "17,19,23/02; 02,09,16,23/03; 04,13,18,20/04",
    //             LocalDate.parse("2022-03-26"),
    //             LocalDate.parse("2022-03-29"),
    //             3600000,
    //             "Du lịch Đà Nẵng - Huế - Thánh Địa La Vang - Động Phong Phong Nha từ Sài Gòn 2022  - Du lịch Miền Trung - Tour Du lịch Đà Nẵng được thiên nhiên đặc biệt ưu đãi, mảnh đất miền Trung đẹp với nhiều dãy núi hùng vỹ xanh rì, những bờ biển cát trắng mịn thoai thoải và những dòng sông trong vắt thơ mộng. Không những vậy, trên con đường di sản miền Trung cùng Du Lịch Việt, du khách còn được thưởng ngoạn những di sản thế giới cuả Việt Nam đó là Phố cổ Hội An – nơi bến cảng một thời sầm uất nhất Đông Dương, quần thể di tích Cố Đô Huế với hệ thống đền đài lăng tẩm nguy nga tráng lệ và Động Phong Nha với nhiều hang động kì bí của tạo hóa."
    //         );
            
    //         tourRepository.saveAll(
    //             List.of(tour0, tour1)
    //         );
    //     };
    // }
}