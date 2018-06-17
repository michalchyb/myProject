package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.User;

import java.util.List;

public interface RunRepository extends JpaRepository<Run, Long> {
    List<Run> findByCity(City city);
    List<Run> findByUser(User user);
}
