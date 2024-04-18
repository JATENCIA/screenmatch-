package com.atencia.screenmatch.model;

public class Series extends Title {

    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Series() {
    }

    public Series(int seasons, int episodesPerSeason, int minutesPerEpisode) {
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public Series(String name, int date, int time, boolean category, String type, double totalGrades, int totalOfEvaluations, int seasons, int episodesPerSeason, int minutesPerEpisode) {
        super(name, date, time, category, type, totalGrades, totalOfEvaluations);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public Series(TitleOmdb titleOmdb, int seasons, int episodesPerSeason, int minutesPerEpisode) {
        super(titleOmdb);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getTime() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Series :" + this.getName() + " Data :" + this.getDate();
    }
}
