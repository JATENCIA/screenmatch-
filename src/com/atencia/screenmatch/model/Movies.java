package com.atencia.screenmatch.model;

import com.atencia.screenmatch.calculations.Classifiable;

public class Movies extends Title implements Classifiable {

    private String director;

    public Movies() {
    }

    public Movies(String director) {
        this.director = director;
    }

    public Movies(String name, int date, int time, boolean category, String type, double totalGrades, int totalOfEvaluations, String director) {
        super(name, date, time, category, type, totalGrades, totalOfEvaluations);
        this.director = director;
    }

    public Movies(TitleOmdb titleOmdb, String director) {
        super(titleOmdb);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassifiable() {
        return (int) calculateMediaEvaluations();
    }

    @Override
    public String toString() {
        return "Movies :" + this.getName() + " Data :" + this.getDate();
    }
}
