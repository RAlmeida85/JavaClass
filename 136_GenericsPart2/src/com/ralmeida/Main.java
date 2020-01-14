package com.ralmeida;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer tim = new SoccerPlayer("Tim");

        // use type in diamonds to restrict the kind of objects accepted by this instance of team
        Team<FootballPlayer> deadHorses = new Team<>("Dead Horses");
        deadHorses.addPlayer(joe);

        // deadHorses.addPlayer(tim);
        // deadHorses.addPlayer(pat);

        System.out.println(deadHorses.numberPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Red Soxs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> palmeiras = new Team<>("Palmeiras");
        palmeiras.addPlayer(tim);

        Team<SoccerPlayer> curintia = new Team<>("Curintia");
        Team<SoccerPlayer> santos = new Team<>("Santos");

        palmeiras.matchResult(curintia, 3, 0);
        palmeiras.matchResult(santos, 2, 0);
        santos.matchResult(curintia,1,1);
        curintia.matchResult(palmeiras, 2,3);
        santos.matchResult(palmeiras,0,2);
        curintia.matchResult(santos, 1,2);

        System.out.println("Rankings: ");
        System.out.println(palmeiras.getName() + ": " + palmeiras.ranking());
        System.out.println(santos.getName() + ": " + santos.ranking());
        System.out.println(curintia.getName() + ": " + curintia.ranking());

        System.out.println(palmeiras.compareTo(curintia));
        System.out.println(curintia.compareTo(santos));

        // comparable is helpful to implements as it allow to use
        // Collections.sort to sort any ArrayList based on compareTo method
        //ArrayList<Team> teams;
        //Collections.sort(teams);
    }
}
