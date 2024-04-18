package com.atencia.screenmatch.calculations;

import com.atencia.screenmatch.model.Title;

public class TimeCalculations {

    private int totalTime;

    public void aggregate(Title title) {
        this.totalTime += title.getTime();
    }

    public int getTotalTime() {
        return totalTime;
    }
}
