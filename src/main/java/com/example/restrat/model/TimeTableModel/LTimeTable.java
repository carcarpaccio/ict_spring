package com.example.restrat.model.TimeTableModel;

import java.time.LocalTime;

public class LTimeTable extends ATimeTableModel {
    LTimeTable(LocalTime chitose, LocalTime minamichitose, LocalTime honbutou, LocalTime kenkyuutou){
        this.setChitose(chitose);
        this.setMinamichitose(minamichitose);
        this.setHonbutou(honbutou);
        this.setKenkyuutou(kenkyuutou);
    }
    public LTimeTable() {
    }
}
