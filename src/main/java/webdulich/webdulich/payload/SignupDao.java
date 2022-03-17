package webdulich.webdulich.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDao {
    String name;
    String username;
    String email;

    public SignupDao(SignupDto data){
        this.name = data.getName();
        this.email = data.getEmail();
        this.username = data.getUsername();
    }
}
