package com.example.restrat.model;

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
        System.out.println(sql);
        return  jdbc.query(sql,newInstance(LTimeTable.class));
    }
}
