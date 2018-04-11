package com.example.bach0.hustplant.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sakur on 4/11/2018.
 */

public class History {
    private String time;
    private String begin;
    private String end;
    private Integer totalRoute;
    private List<String> diem;

    public History(String time, String begin, String end,Integer totalRoute,List<String> list){
        this.time = time;
        this.begin = begin;
        this.end = end;
        this.totalRoute = totalRoute;
        this.diem = list;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getTotalRoute() {
        return totalRoute;
    }

    public void setTotalRoute(Integer totalRoute) {
        this.totalRoute = totalRoute;
    }

    public List<String> getDiem() {
        return diem;
    }

    public void setDiem(List<String> diem) {
        this.diem = diem;
    }
}
