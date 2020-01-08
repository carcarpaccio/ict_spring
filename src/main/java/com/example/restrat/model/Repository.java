package com.example.restrat.model;

import com.example.restrat.model.TimeTableModel.ATimeTable;
import com.example.restrat.model.TimeTableModel.LTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    private JdbcTemplate jdbc;


//    @Autowired
//    public Repository(JdbcTemplate jdbc){
//        this.jdbc=jdbc;
//    }

    List<LTimeTable> leave_select(String time, String dep){
        var sql="SELECT * FROM LTIMETABLE where LTIMETABLE."+dep+">'"+time+"'";
        return  jdbc.query(sql,newInstance(LTimeTable.class));
    }

    List<ATimeTable> arrive_select(String time, String dep){
        var sql="SELECT ATIMETABLE.ID,ATIMETABLE.HONBUTOU,ATIMETABLE.KENKYUTOU,ATIMETABLE.MINAMICHITOSE,ATIMETABLE.CHITOSE,ASTAND.STAND FROM ATIMETABLE LEFT join ASTAND on ASTAND.ID = ATIMETABLE.ID where ATIMETABLE."+dep+">'"+time+"'";
        return  jdbc.query(sql,newInstance(ATimeTable.class));
    }

    void createTable(String stand,String leave,String arrive){
        jdbc.execute("drop table ATIMETABLE");
        jdbc.execute("drop table ASTAND");
        jdbc.execute("drop table LTIMETABLE");



        var lsql="create table LTIMETABLE(id int not null primary key ,chitose time,minamichitose time,kenkyutou time,honbutou time)as select * from CSVREAD('"+leave+"',null,'UTF-8',',')";
        jdbc.execute(lsql);

        var asql="create table ATIMETABLE(id int not null primary key ,chitose time,minamichitose time,kenkyutou time, honbutou time)as select * from CSVREAD('"+arrive+"',null,'UTF-8',',')";
        jdbc.execute(asql);

        var ssql="create table ASTAND( id int not null primary key,stand int not null)as select * from CSVREAD('"+stand+"',null,'UTF-8',',')";
        jdbc.execute(ssql);
    }

}
