package FGObackEnd.interfaces;

import FGObackEnd.entities.Skills;
import org.springframework.http.ResponseEntity;

public interface ISkillService {
    ResponseEntity<Skills> findSkillById(Integer id);
}
