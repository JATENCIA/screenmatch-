package com.atencia.screenmatch.exeption;

public class ConversionValueErrorExeption extends RuntimeException {

    private final String menssage;

    public ConversionValueErrorExeption(String runtimeValueNotAvailable) {

        this.menssage = runtimeValueNotAvailable;

    }

    @Override
    public String getMessage() {
        return this.menssage;
    }
}
