package com.example.ict_spring.model;

import com.example.ict_spring.model.TimeTableModel.LeaveTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

import java.util.List;

@Repository
public class IctRepository {

    @Autowired
    private JdbcTemplate jdbc;

    List<LeaveTimeTable> leave_select(String time,String dep){
        var sql="SELECT * FROM 往路時刻表 where 往路時刻表."+dep+">'"+time+"'";
        System.out.println(sql);
        return  jdbc.query(sql,newInstance(LeaveTimeTable.class));
    }
}
