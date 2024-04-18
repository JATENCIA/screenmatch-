package com.atencia.screenmatch.model;

import com.atencia.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {

    private int number;
    private String name;
    private Series series;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassifiable() {
        return totalViews > 100 ? 4 : 2;
    }
}
