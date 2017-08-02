package ru.thecop.bootangular.dev.dto;

import java.util.Date;

public class SomeDto {
    private Date date;
    private String string;
    private int integer;

    public SomeDto(Date date, String string, int integer) {
        this.date = date;
        this.string = string;
        this.integer = integer;
    }

    public Date getDate() {
        return date;
    }

    public SomeDto setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getString() {
        return string;
    }

    public SomeDto setString(String string) {
        this.string = string;
        return this;
    }

    public int getInteger() {
        return integer;
    }

    public SomeDto setInteger(int integer) {
        this.integer = integer;
        return this;
    }
}
