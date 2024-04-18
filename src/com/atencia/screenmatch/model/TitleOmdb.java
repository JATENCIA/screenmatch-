package com.atencia.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public record TitleOmdb(String title, String year, String runtime, @SerializedName("imdbRating") String imdbRating,
                        String type, @SerializedName("imdbVotes") String imdbVotes) {
}


