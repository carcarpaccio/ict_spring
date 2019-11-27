package com.example.ict_spring.model.TimeTableModel;

import java.time.LocalTime;

public class LeaveTimeTable extends ATimeTable {
    LeaveTimeTable(LocalTime chitose, LocalTime minamichitose, LocalTime honbutou, LocalTime kenkyuutou){
        this.setChitose(chitose);
        this.setMinamichitose(minamichitose);
        this.setHonbutou(honbutou);
        this.setKenkyuutou(kenkyuutou);
    }
    public LeaveTimeTable() {
    }
}
