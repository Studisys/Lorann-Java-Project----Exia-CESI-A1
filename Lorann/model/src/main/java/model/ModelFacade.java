package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.LorannDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getLevelMapById(int)
     */
    @Override
    public Example getLevelMapById(final int id) throws SQLException {
        return LorannDAO.getLevelMapById(id);
    }

   
}
