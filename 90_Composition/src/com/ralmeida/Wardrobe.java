package com.ralmeida;

public class Wardrobe {
    private int doors;
    private int drawers;
    private boolean isDoorsOpen;
    private boolean isDrawersOpen;

    public Wardrobe(int doors, int drawers) {
        isDoorsOpen = false;
        isDrawersOpen = false;
        this.doors = doors;
        this.drawers = drawers;
    }

    public void openDoors() {
        if (isDoorsOpen()) {
            System.out.println("Doors are already open!");
        } else {
            isDoorsOpen = true;
            System.out.println("Doors were opened");
        }
    }

    public void closeDoors() {
        if (!isDoorsOpen()) {
            System.out.println("Doors are already close!");
        } else {
            isDoorsOpen = false;
            System.out.println("Doors were closed");
        }
    }

    public int getDoors() {
        return doors;
    }

    public int getDrawers() {
        return drawers;
    }

    private boolean isDoorsOpen() {
        return isDoorsOpen;
    }

    private boolean isDrawersOpen() {
        return isDrawersOpen;
    }
}
