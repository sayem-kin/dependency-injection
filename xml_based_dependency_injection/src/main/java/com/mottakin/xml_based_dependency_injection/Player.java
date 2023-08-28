package com.mottakin.xml_based_dependency_injection;

import jakarta.annotation.PreDestroy;

public class Player {
    private String name;
    private String team;
    private Sponsor sponsor;

    public Player() {
        System.out.println("No arg constructor called from Player class");
    }

    public Player(String name, String team, Sponsor sponsor) {
        this.name = name;
        this.team = team;
        this.sponsor = sponsor;
        System.out.println("Constructor called from Player class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Player class destroyed");
    }
}
