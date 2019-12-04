package com.example.restrat.model.TimeTableModel;

import java.time.LocalTime;

public class LTimeTable extends ATimeTableModel {
    LTimeTable(int id,LocalTime chitose, LocalTime minamichitose, LocalTime honbutou, LocalTime kenkyutou){
        this.setID(id);
        this.setChitose(chitose);
        this.setMinamichitose(minamichitose);
        this.setHonbutou(honbutou);
        this.setKenkyutou(kenkyutou);
    }
    public LTimeTable() {
    }
}
