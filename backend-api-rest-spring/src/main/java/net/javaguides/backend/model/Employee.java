package package net.javaguides.backend.model;
import lombok.Getter;
import lombok.*;

@NoArgsContructor
@AllArgsConstructor

@Getter
@Data
@Entity

@Table(name= "employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

}

