package FGObackEnd.interfaces;

import FGObackEnd.entities.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepo extends JpaRepository<Skills, Integer> {
}
