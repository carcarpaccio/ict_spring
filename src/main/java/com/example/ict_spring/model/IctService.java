package com.example.ict_spring.model;

import com.example.ict_spring.model.TimeTableModel.ArriveTimeTable;
import com.example.ict_spring.model.TimeTableModel.LeaveTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class IctService {
    @Autowired
    IctRepository repository;

    public List<LeaveTimeTable> leave_findAll(String time,String dep){
        try{
            return repository.leave_select(time,dep);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
