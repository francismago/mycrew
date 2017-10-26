package com.arbalest.mycrew.dao.interfaces;

import com.arbalest.mycrew.enums.DataModelCommand;

/**
 * Created by francis on 10/20/17
 *
 * D = data .
 * R = Response
 */
public interface SearchDataRepository<D,R> {

    public R search(DataModelCommand dataModelCommand, D data);
}
