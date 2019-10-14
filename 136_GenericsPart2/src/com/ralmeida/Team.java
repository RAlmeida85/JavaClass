package com.ralmeida;

import java.util.ArrayList;

// java generics allow us to added type parameter (inside diamonds sign)
// to restrict the kind of objects accepted by each instance of such class
// i.e. we are setting Team to accept only one type of Player defined on creation of this instance(see main)
// implements of interface Comparable allow us to compare 2 objects of same type (in this case Team)
// use of <> on Team is to restrict the comparison to 2 Teams of same type only
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team!");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numberPlayers(){
        return this.members.size();
    }

    //use generic on argument will allow only same type of object to be passed when method called
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() == team.ranking()) {
            return 0;
        } else {
            return 1;
        }
    }
}
