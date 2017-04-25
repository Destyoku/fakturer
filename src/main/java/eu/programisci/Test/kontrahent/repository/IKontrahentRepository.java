package eu.programisci.Test.kontrahent.repository;

import eu.programisci.Test.kontrahent.ob.KontrahentOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKontrahentRepository extends JpaRepository<KontrahentOB, Long>{
}
