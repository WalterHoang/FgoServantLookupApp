package FGObackEnd.daos;

import FGObackEnd.entities.Skills;
import FGObackEnd.interfaces.ISkillDao;
import FGObackEnd.interfaces.ISkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * This component accesses the skills table in postgres
 */
@Component
public class SkillDao implements ISkillDao {
    @Autowired
    private ISkillRepo skillRepo;

    @Override
    public Optional<Skills> getSkillById(Integer id) {
        return skillRepo.findById(id);
    }
}
