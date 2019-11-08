package FGObackEnd.controllers;

import FGObackEnd.entities.Skills;
import FGObackEnd.interfaces.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller handles the requests related to
 * servant skills
 */
@RestController
@RequestMapping(value = "/skills")
public class FgoSkillController {
    @Autowired
    private ISkillService skillService;

    /**
     * Gets a single skill by id
     *
     * @param id id of the skill
     * @return a single skill
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Skills> getSkillById(@PathVariable Integer id) {
        return skillService.findSkillById(id);
    }
}
