package FGObackEnd.interfaces;

import FGObackEnd.entities.Servant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServantRepo extends JpaRepository<Servant, Integer> {
}
