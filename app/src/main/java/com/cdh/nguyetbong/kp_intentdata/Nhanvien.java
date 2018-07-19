package com.cdh.nguyetbong.kp_intentdata;

import java.io.Serializable;

public class Nhanvien implements Serializable{
    private String ten;
    private Integer tuoi;

    public Nhanvien(String ten, Integer tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
}
