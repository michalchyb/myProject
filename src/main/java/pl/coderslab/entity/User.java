package pl.coderslab.entity;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotBlank
    @Size(min = 3)
    @Pattern(regexp="[a-zA-Z]*")
    private String name;
    @NotNull
    @NotBlank
    @Size(min = 2)
    @Pattern(regexp="[a-zA-Z]*")
    private String lastName;

    @Email
    private String email;

    //@ManytoMany
    @OneToMany
    private List<Run> runs = new ArrayList<Run>();


    public User() {
    }

    public User(String name, String lastName, String email, List<Run> runs) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.runs = runs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Run> getRuns() {
        return runs;
    }

    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", runs=" + runs +
                '}';
    }
}
