package com.atencia.screenmatch.calculations;

public class RecommendationsFilter {

    public void filterClassification(Classifiable classifiable) {

        if (classifiable.getClassifiable() >= 4) {
            System.out.println("Highly recommended! This work offers an exceptional experience you won't want to miss.");
        } else if (classifiable.getClassifiable() >= 2) {
            System.out.println("Recommended! This work is an excellent choice for enjoying good entertainment.");
        } else {
            System.out.println("Discover something new! This work could be a pleasant surprise that immerses you in an exciting experience.");
        }

    }


}
