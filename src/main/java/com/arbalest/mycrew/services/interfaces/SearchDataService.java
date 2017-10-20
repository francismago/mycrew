package com.arbalest.mycrew.services.interfaces;

/**
 * Created by francis on 10/20/17
 *
 * D = data .
 * R = Response
 */
public interface SearchDataService<D,R> {

    public R search(D data);
}
