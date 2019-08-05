package com.ralmeida;

public class Bed {

    private String size;
    private Mattress mattress;

    public Bed(String size, Mattress mattress) {
        this.size = size;
        this.mattress = mattress;
    }

    public void mattressFit(Mattress mattress){
        if (this.size.equals(mattress.getSize())) {
            System.out.println("Mattress fits on bed.");
        } else {
            System.out.println("Mattress does not fit");
        }
    }

    public String getSize() {
        return size;
    }

    public Mattress getMattress() {
        return mattress;
    }
}
