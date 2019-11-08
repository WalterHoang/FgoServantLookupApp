package FGObackEnd.interfaces;

import FGObackEnd.entities.Skills;

import java.util.Optional;

public interface ISkillDao {
    Optional<Skills> getSkillById(Integer id);
}
