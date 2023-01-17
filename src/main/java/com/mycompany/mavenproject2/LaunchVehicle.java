package com.mycompany.mavenproject2;

/**
 * Represents a launch vehicle
 * @author Jaime Sanchez Mendieta
 */
public class LaunchVehicle extends Spacecraft {
    public boolean inFlight;
    public boolean inOrbit;

    public LaunchVehicle(String name, String mission) {
        super(name, mission);
        this.thrust = 3500;
        this.speed = 0;
        this.weight = 2900;
        this.crewCapacity = 0;
        this.fuel = "RP-1, LH2";
        this.inFlight = false;
        this.inOrbit = false;
    }
    
    public void inOrbit() {
        this.inOrbit = true;
    }
        
    @Override
    public void propel() {
        this.speed = this.speed + 8600;
        this.inFlight = true;
    }
    
    @Override
    public void launch() {
        this.speed = 4000;
        this.inFlight = true;
        this.inOrbit = false;
    }
    
    @Override
    public String toString() {
        return "Name: "+name+" Mission: "+mission+" Thrust: "+thrust+" Speed: "+speed+" Weight: "+weight+" Crew Capacity: "+crewCapacity+" Fuel: "+fuel+" In Flight: "+inFlight+" In Orbit: "+inOrbit;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }   
}
