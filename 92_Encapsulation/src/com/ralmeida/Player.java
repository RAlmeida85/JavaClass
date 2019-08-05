package com.ralmeida;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        System.out.println("Player " + this.name + " took " + damage + " damage");
        if(this.health <= 0){
            System.out.println("Player knocked out!");
            // Reduce number of lives remaining
        }
    }

    public int healthRemaining() {
        return  this.health;
    }
}
