package pl.coderslab.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Run {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotBlank
    @Size(min = 3)
    private String nameRun;
    @NotNull
    private Double distance;
    @NotNull
    @NotBlank
    private String date;

    private String time;
    @ManyToOne
    private City city;
    //@ManytoMany(mappedBy = "run")
    @ManyToOne
    private User user;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Run() {
    }

    public Run(String nameRun, Double distance, String date, String time, City city, User user) {
        this.nameRun = nameRun;
        this.distance = distance;
        this.date = date;
        this.time = time;
        this.city = city;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameRun() {
        return nameRun;
    }

    @Override
    public String toString() {
        return "Run{" +
                "id=" + id +
                ", nameRun='" + nameRun + '\'' +
                ", distance=" + distance +
                ", date='" + date + '\'' +
                '}';
    }

    public void setNameRun(String nameRun) {
        this.nameRun = nameRun;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
