package eu.programisci.Test.towar.repository;

import eu.programisci.Test.kontrahent.ob.KontrahentOB;
import eu.programisci.Test.towar.ob.TowarOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITowarRepository extends JpaRepository<TowarOB, Long> {
}
