package com.example.restrat.model;

import com.example.restrat.model.TimeTableModel.ATimeTable;
import com.example.restrat.model.TimeTableModel.LTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<LTimeTable> lTimeTables;
    private List<ATimeTable> aTimeTables;

    private String dir;

    @Autowired
    Repository repository;

    public void leave_findAll(String time, String dep){
        try{
            System.out.println(repository.leave_select(time,dep).get(1).getID());
            System.out.println("find");
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void arrive_findAll(String time, String dep){
        try{
            aTimeTables= repository.arrive_select(time,dep);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public List<LTimeTable> getlTimeTables() {
        return lTimeTables;
    }

    public List<ATimeTable> getaTimeTables() {
        return aTimeTables;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
