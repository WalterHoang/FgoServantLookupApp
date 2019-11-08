package FGObackEnd.services;

import FGObackEnd.entities.Skills;
import FGObackEnd.exceptions.NotFound;
import FGObackEnd.exceptions.ServiceUnavailable;
import FGObackEnd.exceptions.Unexpected;
import FGObackEnd.interfaces.ISkillDao;
import FGObackEnd.interfaces.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;

import java.util.Optional;

import static FGObackEnd.constants.StringConstants.SKILL_NOT_FOUND;

/**
 * This service determines the status code to return
 */
@Service
public class SkillService implements ISkillService {
    @Autowired
    private ISkillDao skillDao;

    /**
     * Gets a single skill by id
     *
     * @param id id of the skill
     * @return a single skill
     */
    @Override
    public ResponseEntity<Skills> findSkillById(Integer id) {
        try {
            Optional<Skills> skill = skillDao.getSkillById(id);
            if (skill.isPresent()) {
                return new ResponseEntity<>(skill.get(), HttpStatus.OK);
            } else {
                throw new NotFound(SKILL_NOT_FOUND);
            }
        } catch (CannotCreateTransactionException exct) {
            throw new ServiceUnavailable();
        } catch (Exception ex) {
            if (ex.getMessage().equals(SKILL_NOT_FOUND)) {
                throw new NotFound(SKILL_NOT_FOUND);
            } else {
                throw new Unexpected();
            }
        }
    }
}
