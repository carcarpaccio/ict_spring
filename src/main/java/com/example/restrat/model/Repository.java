package com.example.restrat.model;

import com.example.restrat.model.TimeTableModel.ATimeTable;
import com.example.restrat.model.TimeTableModel.LTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@org.springframework.stereotype.Repository
public class Repository {
//    @Autowired
    private JdbcTemplate jdbc;


    @Autowired
    public Repository(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }

    List<LTimeTable> leave_select(String time, String dep){
        var sql="SELECT * FROM LTIMETABLE where LTIMETABLE."+dep+">'"+time+"'";
        return  jdbc.query(sql,newInstance(LTimeTable.class));
    }

    List<ATimeTable> arrive_select(String time, String dep){
        var sql="SELECT * FROM ATIMETABLE LEFT join ASTAND on ASTAND.ID = ATIMETABLE.ID where ATIMETABLE."+dep+">'"+time+"'";
        return  jdbc.query(sql,newInstance(ATimeTable.class));
    }

}
