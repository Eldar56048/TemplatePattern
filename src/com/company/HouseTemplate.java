package com.company;

public abstract class HouseTemplate {

    public void buildWindows(){
        System.out.println("BuildWindows of the house");
    }
    public abstract void buildWalls();
    public abstract void buildPillars();
    public void buildFoundation(){
        System.out.println("Build foundation of the house");
    }
    public void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }
}
