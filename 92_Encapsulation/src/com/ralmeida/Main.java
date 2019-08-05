package com.ralmeida;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Zequinha";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 5;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//
//        player.health = 50;
//        damage = 17;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Zeca", 70, "Spear");
        System.out.println("Initial health: " + player.getHealth());


    }
}
