package FGObackEnd.interfaces;

import FGObackEnd.entities.Servant;

import java.util.List;
import java.util.Optional;

public interface IServantDao {
    List<Servant> getAllServants();

    Optional<Servant> getServantById(Integer id);
}
