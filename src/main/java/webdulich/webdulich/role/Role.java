package webdulich.webdulich.role;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.checkerframework.common.aliasing.qual.Unique;

@Setter
@Getter
@Entity
@Table(name = "roles", uniqueConstraints= {
    @UniqueConstraint(columnNames = {"name"})
})
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60)
    @Unique
    private String name;
}
