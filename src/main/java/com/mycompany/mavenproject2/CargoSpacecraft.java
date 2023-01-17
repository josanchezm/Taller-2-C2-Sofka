package com.mycompany.mavenproject2;

/**
 * Represents an unmanned ship
 * @author Jaime Sanchez Mendieta
 */
public class CargoSpacecraft extends Spacecraft {
    public boolean inFlight;
    public boolean inOrbit;

    public CargoSpacecraft(String name, String mission) {
        super(name, mission);
        this.thrust = 45.39;
        this.speed = 0;
        this.weight = 5.670;
        this.crewCapacity = 0;
        this.fuel = "MMH, NO";
        this.inFlight = false;
        this.inOrbit = false;
    }
    
    public void inOrbit() {
        this.inOrbit = true;
    }
    
    @Override
    public void propel() {
        this.speed += 18000;
        this.inFlight = true;
    }

    @Override
    public void launch() {
       this.speed = 3500;
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

    public boolean isInOrbit() {
        return inOrbit;
    }

    public void setInOrbit(boolean inOrbit) {
        this.inOrbit = inOrbit;
    }
}
