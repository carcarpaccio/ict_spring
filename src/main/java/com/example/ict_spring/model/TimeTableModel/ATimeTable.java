package com.example.ict_spring.model.TimeTableModel;

import java.time.LocalTime;

abstract public class ATimeTable {
    private int ID;
    private LocalTime chitose;
    private LocalTime minamichitose;
    private LocalTime honbutou;
    private LocalTime kenkyuutou;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalTime getChitose() {
        return chitose;
    }

    public void setChitose(LocalTime chitose) {
        this.chitose = chitose;
    }

    public LocalTime getMinamichitose() {
        return minamichitose;
    }

    public void setMinamichitose(LocalTime minamichitose) {
        this.minamichitose = minamichitose;
    }

    public LocalTime getHonbutou() {
        return honbutou;
    }

    public void setHonbutou(LocalTime honbutou) {
        this.honbutou = honbutou;
    }

    public LocalTime getKenkyuutou() {
        return kenkyuutou;
    }

    public void setKenkyuutou(LocalTime kenkyuutou) {
        this.kenkyuutou = kenkyuutou;
    }
}
