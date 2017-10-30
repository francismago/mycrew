package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.dao.interfaces.SaveDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.model.vo.SeasonVo;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/26/17.
 */
@Repository
public class SeasonDao implements SaveDataRepository<SeasonVo> {
    @Override
    public void save(DataModelCommand dataModelCommand, SeasonVo data) {

    }
}
