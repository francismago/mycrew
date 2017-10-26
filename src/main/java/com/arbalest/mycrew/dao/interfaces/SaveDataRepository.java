package com.arbalest.mycrew.dao.interfaces;

import com.arbalest.mycrew.enums.DataModelCommand;

/**
 * Created by francis on 10/20/17.
 *
 *  D = Data
 */
public interface SaveDataRepository<D> {

    public void  save(DataModelCommand dataModelCommand, D data);
}
