package com.example.restrat.model.TimeTableModel;

import java.time.LocalTime;

public class ATimeTable extends ATimeTableModel{
    private int stand;

    public ATimeTable (Integer id,LocalTime chitose,LocalTime minamichitose,LocalTime kenkyutou,LocalTime honbutou,Integer stand) {
        this.setID(id);
        this.setChitose(chitose);
        this.setMinamichitose(minamichitose);
        this.setKenkyutou(kenkyutou);
        this.setHonbutou(honbutou);
        this.setStand(stand);
    }
    public ATimeTable(){}

    public void setStand(int stand) {
        this.stand = stand;
    }
}
