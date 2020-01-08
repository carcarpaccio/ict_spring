package com.example.restrat.model;

import com.example.restrat.model.TimeTableModel.ATimeTable;
import com.example.restrat.model.TimeTableModel.Dir;
import com.example.restrat.model.TimeTableModel.LTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<LTimeTable> lTimeTables;
    private List<ATimeTable> aTimeTables;

    private Dir dir;

    @Autowired
    Repository repository;

    public void findAll(String time, String dep){
        if(time.equals(""))   time=LocalTime.now().getHour()+":"+LocalTime.now().getMinute();
        time=time+":00";


        if(this.dir==Dir.dep){
            try{
                lTimeTables=repository.leave_select(time,dep);
            }
            catch (DataAccessException e) {
                e.printStackTrace();
            }
        }
        else if(this.dir==Dir.arr){
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

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }

    public void createTable(String leave,String arrive,String stand){
        repository.createTable(leave,arrive,stand);
    }
}
