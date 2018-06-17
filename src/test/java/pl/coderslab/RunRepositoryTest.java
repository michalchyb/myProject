package pl.coderslab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import pl.coderslab.entity.City;
import pl.coderslab.entity.Run;
import pl.coderslab.entity.RunImport;
import pl.coderslab.repository.RunImportRepository;
import pl.coderslab.repository.RunRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RunRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private RunImportRepository runImportRepository;

    @Test
    public void find_by_city_id() {
//        //given
//        Student	john	=	new	Student();
//        john.setFirstName("John");
//        entityManager.persist(john);
//        //when
//        Student	result	=	studentRepository.findOneByFirstName("John");
//        //then
//        assertEquals(result.getFirstName(),	john.getFirstName());
        City city1 = new City();
        city1.setName("Warszawa");
        city1.setId(1);
        City city2 = new City();
        city2.setName("Gdansk");
        city2.setId(2);
        Run run1 = new Run();
        Run run2 = new Run();
        Run run3 = new Run();
        run1.setNameRun("Bieg1");
        run2.setNameRun("Bieg2");
        run3.setNameRun("Bieg3");
        run1.setCity(city2);
        run2.setCity(city2);
        run3.setCity(city1);
        entityManager.persist(city1);
        entityManager.persist(city2);
        entityManager.persist(run1);
        entityManager.persist(run2);
        entityManager.persist(run3);

       // RunImport result = runImportRepository.findByCityId(1);



    }
}
