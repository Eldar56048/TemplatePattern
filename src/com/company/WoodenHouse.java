package com.company;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Build the Walls of the Wooden House");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build the Pillars of the Wooden House");
    }
}
