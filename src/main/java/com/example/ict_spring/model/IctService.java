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

    public List<LeaveTimeTable> leave_findAll(String time){
        try{
            //System.out.println(repository.leave_select(time).get(0).getChitose());//消す
            //System.out.println(repository.leave_select(time).get(1).getChitose());
            return repository.leave_select(time);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<LeaveTimeTable> arrive_findAll(String time){
        try{
            System.out.println(repository.leave_select(time).get(0).getChitose());//消す
            System.out.println(repository.leave_select(time).get(1).getChitose());
            return repository.arrive_select(time);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
