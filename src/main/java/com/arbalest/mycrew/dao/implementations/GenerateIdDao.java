package com.arbalest.mycrew.dao.implementations;

import com.arbalest.mycrew.constants.InitialValue;
import com.arbalest.mycrew.dao.interfaces.GenerateDataRepository;
import com.arbalest.mycrew.enums.DataModelCommand;
import com.arbalest.mycrew.enums.SequenceType;
import com.arbalest.mycrew.model.db.Sequence;
import com.arbalest.mycrew.model.repositories.SequenceRepository;
import com.arbalest.mycrew.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by francis on 10/26/17.
 */
@Repository("generateIdDao")
public class GenerateIdDao implements GenerateDataRepository<Integer,Integer> {


    @Autowired
    private SequenceRepository sequenceRepository;


    @Override
    public Integer generate(DataModelCommand dataModelCommand, Integer year) {
        switch (dataModelCommand){
            case CLUB_GENERATE_ID:   return generateClubId(year);
            case PLAYER_GENERATE_ID: return generatePlayerId(year);
        }
        return null;
    }

    private Integer generateClubId(Integer year){
        Sequence sequence = sequenceRepository.findByType(SequenceType.CLUB_ID.toString());
        Integer sequenceId  = (sequence == null ?  InitialValue.CLUB_ID: Integer.parseInt(sequence.getValue()));
        if (sequence == null){
            sequence = new Sequence();
//            sequence.setSequenceId(DateUtil.getYear());
            sequence.setType(SequenceType.CLUB_ID.toString());
        }
        ++sequenceId;
        sequence.setValue(sequenceId.toString());
        sequenceRepository.save(sequence);
        Integer generatedId = Integer.parseInt(year.toString() + sequenceId.toString());
        System.out.println("generateClubId="+generatedId);
        return generatedId;
    }


    private Integer generatePlayerId(Integer year){
        Sequence sequence = sequenceRepository.findByType(SequenceType.PLAYER_ID.toString());
        Integer sequenceId  = (sequence == null ?  InitialValue.PLAYER_ID: Integer.parseInt(sequence.getValue()));
        if (sequence == null){
            sequence = new Sequence();
            sequence.setType(SequenceType.PLAYER_ID.toString());
            sequence.setValue(sequenceId.toString());
        }
        ++sequenceId;
        sequence.setValue(sequenceId.toString());
        sequenceRepository.save(sequence);
        Integer generatedId = Integer.parseInt(year.toString() + sequenceId.toString());
        System.out.println("generatePlayerId="+generatedId);
        return generatedId;
    }

    private void updateSequenceValue() {

    }
}
