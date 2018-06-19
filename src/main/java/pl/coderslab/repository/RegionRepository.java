package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Region;
import pl.coderslab.entity.Run;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {
}
