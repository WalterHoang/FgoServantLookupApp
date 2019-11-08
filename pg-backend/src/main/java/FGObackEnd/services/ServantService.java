package FGObackEnd.services;

import FGObackEnd.entities.Servant;
import FGObackEnd.exceptions.NotFound;
import FGObackEnd.exceptions.ServiceUnavailable;
import FGObackEnd.exceptions.Unexpected;
import FGObackEnd.interfaces.IServantDao;
import FGObackEnd.interfaces.IServantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static FGObackEnd.constants.StringConstants.SERVANT_NOT_FOUND;

@Service
public class ServantService implements IServantService {
    @Autowired
    private IServantDao servantDao;
    private EnhancedSearch enhancedSearch = new EnhancedSearch();

    /**
     * This method gets a list of all servants
     *
     * @return a list with all servants
     */
    @Override
    public ResponseEntity<List<Servant>> getAllServants() {
        try {
            return new ResponseEntity<>(servantDao.getAllServants(), HttpStatus.OK);
        } catch (CannotCreateTransactionException exct) {
            throw new ServiceUnavailable();
        } catch (Exception ex) {
            throw new Unexpected();
        }
    }

    /**
     * This method gets a list of all servants that contains
     * the matching name
     *
     * @param name name of the servant(s) to return
     * @return a list of servants matching the name
     */
    @Override
    public ResponseEntity<List<Servant>> getServantsSearch(String name) {
        try {
           String searchName = enhancedSearch.enhancedSearch(name);
            List<Servant> servants = servantDao.getAllServants();
            List<Servant> filteredServants = new ArrayList<>();
            servants.forEach(servant -> {
                if (servant.getName().contains(searchName)) {
                    filteredServants.add(servant);
                }
            });
            if (filteredServants.isEmpty()) {
                throw new NotFound(SERVANT_NOT_FOUND);
            } else {
                return new ResponseEntity<>(filteredServants, HttpStatus.OK);
            }
        } catch (CannotCreateTransactionException exct) {
            throw new ServiceUnavailable();
        } catch (Exception ex) {
            if (ex.getMessage().equals(SERVANT_NOT_FOUND)) {
                throw new NotFound(SERVANT_NOT_FOUND);
            } else {
                throw new Unexpected();
            }
        }
    }

    /**
     * Gets a single servant by id
     *
     * @param id id of the servant
     * @return a single servant
     */
    @Override
    public ResponseEntity<Servant> getServantById(Integer id) {
        try {
            Optional<Servant> servant = servantDao.getServantById(id);
            if (servant.isPresent()) {
                return new ResponseEntity<>(servant.get(), HttpStatus.OK);
            } else {
                throw new NotFound(SERVANT_NOT_FOUND);
            }
        } catch (CannotCreateTransactionException exct) {
            throw new ServiceUnavailable();
        } catch (Exception ex) {
            throw new Unexpected();
        }
    }
}
