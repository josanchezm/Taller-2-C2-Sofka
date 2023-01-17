package com.mycompany.mavenproject2;

/**
 * Represents a planetary exploration rover
 * @author Jaime Sanchez Mendieta
 */
public class Rover extends Spacecraft implements Stopping {
    public boolean onLand, moving;

    public Rover(String name, String mission) {
        super(name, mission);
        this.thrust = 0;
        this.speed = 0;
        this.weight = 899;
        this.crewCapacity = 0;
        this.fuel = "RTG";
        this.onLand = false;
        this.moving = false;
    }
    
    @Override
    public void propel() {
        this.speed += 0.04;
        this.moving = true;
    }

    @Override
    public void launch() {
        this.speed = 0.1;
        this.moving = true;
        this.onLand = true; // Remains on land while launching because it is a terrain exploration vehicle
    }
    
    @Override
    public void stopping() {
       this.onLand = true;
       this.moving = false;
       this.speed = 0;
    }
    
    @Override
    public String toString() {
        return "Name: "+name+" Mission: "+mission+" Thrust: "+thrust+" Speed: "+speed+" Weight: "+weight+" Crew Capacity: "+crewCapacity+" Fuel: "+fuel+" On Land: "+onLand+" Moving: "+moving;
    }

    public boolean isOnLand() {
        return onLand;
    }

    public void setOnLand(boolean onLand) {
        this.onLand = onLand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
}
