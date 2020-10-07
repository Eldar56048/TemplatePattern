package com.company;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Build the walls of the Glass House");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build the pillars of the Glass House");
    }
}
