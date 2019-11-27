package com.example.ict_spring.model.TimeTableModel;

import java.time.LocalTime;

public class ArriveTimeTable extends ATimeTable {
    private int stand;
    ArriveTimeTable(LocalTime chitose, LocalTime minamichitose, LocalTime honbutou, LocalTime kenkyuutou, int stand){
        this.setChitose(chitose);
        this.setMinamichitose(minamichitose);
        this.setHonbutou(honbutou);
        this.setKenkyuutou(kenkyuutou);
        this.stand=stand;
    }
    ArriveTimeTable(){}
    public int getStand() {
        return stand;
    }
    public void setStand(int stand){
        this.stand=stand;
    }
}
