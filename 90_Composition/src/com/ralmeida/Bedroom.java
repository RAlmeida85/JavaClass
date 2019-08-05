package com.ralmeida;

public class Bedroom {

    public int doors;
    public int windows;
    public Wardrobe wardrobe;
    public Bed bed;
    public Mattress mattress;

    public Bedroom(int doors, int windows, Wardrobe wardrobe, Bed bed, Mattress mattress) {
        this.doors = doors;
        this.windows = windows;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.mattress = mattress;
    }

}
