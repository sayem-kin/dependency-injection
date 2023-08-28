package com.mottakin.xml_based_dependency_injection;

import jakarta.annotation.PreDestroy;

public class Sponsor {
    private String sponsorName;

    public Sponsor() {
        System.out.println("No arg constructor called from Sponsor class");
    }

    public Sponsor(String sponsorName) {
        this.sponsorName = sponsorName;
        System.out.println("Constructor called from Sponsor class");

    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Sponsor class destroyed");
    }

}
