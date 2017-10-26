package com.arbalest.mycrew.dao.interfaces;

import com.arbalest.mycrew.enums.DataModelCommand;

/**
 * Created by francis on 10/26/17.
 */
public interface GenerateDataRepository<D,R> {

    public R generate(DataModelCommand dataModelCommand, D data);

}
