package com.mycompany.mavenproject2;

/**
 * Represents a manned ship
 * @author Jaime Sanchez Mendieta
 */
public class MannedSpaceship extends Spacecraft implements ToLand {
    public boolean inFlight;
    public boolean inOrbit;

    public MannedSpaceship(String name, String mission) {
        super(name, mission);
        this.thrust = 45.39;
        this.speed = 0;
        this.weight = 419725;
        this.crewCapacity = 7;
        this.fuel = "NO4, UDMH";
        this.inFlight = false;
        this.inOrbit = false;
    }
    
    public void inOrbit() {
        this.inOrbit = true;
    }
    
    @Override
    public void propel() {
        this.speed += 28000;
        this.inFlight = true;
    }

    @Override
    public void launch() {
        this.speed = 7.66;
        this.inFlight = true;
        this.inOrbit = false;
    }
    
    @Override
    public void landing() {
        this.inOrbit = false;
        this.inFlight = false;
        this.speed = 0;
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

    public boolean isInOrbit() {
        return inOrbit;
    }

    public void setInOrbit(boolean inOrbit) {
        this.inOrbit = inOrbit;
    }
}
