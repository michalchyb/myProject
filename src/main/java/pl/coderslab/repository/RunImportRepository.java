package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.RunImport;

import java.util.List;

public interface RunImportRepository extends JpaRepository<RunImport, Long> {

    List<RunImport> findByCityId(long id);
}
