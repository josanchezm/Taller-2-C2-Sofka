package com.mycompany.mavenproject2;

/**
 * This abstract class works as a template to create spaceships
 * @author Jaime Sanchez Mendieta
 */
public abstract class Spacecraft {
    // Attributes
    public double thrust, speed, weight;
    public int crewCapacity;
    public String name, fuel, mission;
    
    // Constructor
    public Spacecraft(String name, String mission) { // variable initialization
        this.thrust = 0;
        this.speed = 0;
        this.weight = 0;
        this.crewCapacity = 0;
        this.name = name;
        this.fuel = "";
        this.mission = mission;
    }
    
    // Methods
    public abstract void propel();
    public abstract void launch();  
}
