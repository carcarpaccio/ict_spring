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

    public void findAll(String time, String dep){
        if(this.dir.equals("dep")){
            try{
                lTimeTables=repository.leave_select(time,dep);
            }
            catch (DataAccessException e) {
                e.printStackTrace();
            }
        }
        else if(this.dir.equals("arr")){
            try{
                aTimeTables= repository.arrive_select(time,dep);
            }
            catch (DataAccessException e) {
                e.printStackTrace();
            }
        }
        else System.out.println("error");
    }

    public List<LTimeTable> getlTimeTables() {
        return lTimeTables;
    }

    public List<ATimeTable> getaTimeTables() {
        return aTimeTables;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }
}
