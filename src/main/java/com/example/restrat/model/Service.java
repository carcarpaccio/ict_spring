package com.example.restrat.model;

import com.example.restrat.model.TimeTableModel.LTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;

    public List<LTimeTable> leave_findAll(String time, String dep){
        try{
            return repository.leave_select(time,dep);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
