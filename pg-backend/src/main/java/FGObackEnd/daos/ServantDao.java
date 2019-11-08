package FGObackEnd.daos;

import FGObackEnd.entities.Servant;
import FGObackEnd.interfaces.IServantDao;
import FGObackEnd.interfaces.IServantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Dao object to access database
 */
@Component
public class ServantDao implements IServantDao {
    @Autowired
    private IServantRepo servantRepo;

    /**
     * This method gets a list of all servants
     *
     * @return a list with all servants
     */
    @Override
    public List<Servant> getAllServants() {
        return servantRepo.findAll();
    }

    /**
     * Gets a single servant by id
     *
     * @param id id of the servant
     * @return a single servant
     */
    @Override
    public Optional<Servant> getServantById(Integer id) {
        return servantRepo.findById(id);
    }
}
