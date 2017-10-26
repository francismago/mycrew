package com.arbalest.mycrew.dao.interfaces;

import com.arbalest.mycrew.enums.DataModelCommand;

/**
 * Created by francis on 10/20/17.
 *
 * D = data
 */
public interface UpdateDataRepository<D> {

    public void update(DataModelCommand dataModelCommand, D data);
}
