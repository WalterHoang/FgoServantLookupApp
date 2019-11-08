package FGObackEnd.controllers;

import FGObackEnd.entities.Servant;
import FGObackEnd.interfaces.IServantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servants")
public class FgoServantController {
    @Autowired
    private IServantService servantService;

    /**
     * This method gets a list of all servants
     * @return a list with all servants
     */
    @GetMapping
    public ResponseEntity<List<Servant>> getAllServants(){
        return servantService.getAllServants();
    }

    /**
     * This method gets a list of all servants that contains
     * the matching name
     * @param servantname name of the servant(s) to return
     * @return a list of servants matching the name
     */
    @GetMapping(value = "/servantname")
    public ResponseEntity<List<Servant>> getServantsSearch(@RequestParam String servantname){
        return servantService.getServantsSearch(servantname);
    }

    /**
     * Gets a single servant by id
     * @param id id of the servant
     * @return a single servant
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Servant> getServantById(@PathVariable Integer id){
        return servantService.getServantById(id);
    }
}
