package com.atencia.screenmatch.model;


import com.atencia.screenmatch.exeption.ConversionValueErrorExeption;

public class Title implements Comparable<Title> {
    private String name;
    private int date;
    private int time;
    private boolean category;
    private String type;
    private double totalGrades;
    private int totalOfEvaluations;

    public Title() {
    }

    public Title(String name, int date, int time, boolean category, String type, double totalGrades, int totalOfEvaluations) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.category = category;
        this.type = type;
        this.totalGrades = totalGrades;
        this.totalOfEvaluations = totalOfEvaluations;
    }

    public Title(TitleOmdb titleOmdb) {
        this.name = titleOmdb.title();
        this.date = Integer.valueOf(titleOmdb.year());
        this.type = titleOmdb.type();
        this.totalGrades = Double.valueOf(titleOmdb.imdbRating());
        this.totalOfEvaluations = Integer.valueOf(titleOmdb.imdbVotes().replace(",", ""));
        if (titleOmdb.runtime().contains("N/A")) {
            throw new ConversionValueErrorExeption("Runtime value not available");
        }
        this.time = Integer.valueOf(titleOmdb.runtime().substring(0, 3).replace(" ", ""));
    }


    public void displayTechnicalSheet() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("The release date is: " + date);
        System.out.println("The time is: " + getTime());
    }


    public double calculateMediaEvaluations() {
        return totalGrades / totalOfEvaluations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }

    public double getTotalGrades() {
        return totalGrades;
    }

    public int getTotalOfEvaluations() {
        return totalOfEvaluations;
    }

    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", category=" + category +
                ", type='" + type + '\'' +
                ", totalGrades=" + totalGrades +
                ", totalOfEvaluations=" + totalOfEvaluations +
                '}';
    }
}
