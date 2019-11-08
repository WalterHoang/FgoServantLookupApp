package FGObackEnd.interfaces;

import FGObackEnd.entities.Servant;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IServantService {
    ResponseEntity<List<Servant>> getAllServants();

    ResponseEntity<List<Servant>> getServantsSearch(String name);

    ResponseEntity<Servant> getServantById(Integer id);
}
