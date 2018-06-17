package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.City;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String city);
}
