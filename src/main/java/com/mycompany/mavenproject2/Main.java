package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 * Represents the main class in which it can been created instances of the different classes
 * @author Jaime Sanchez Mendieta
 */
public class Main {
    public static boolean control = true, control2 = true;
    public static int option, option2;
    public static String name, mission;
    public static void main(String[] args) {
        Scanner optionInput = new Scanner(System.in);
        Scanner option2Input = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner missionInput = new Scanner(System.in);
        System.out.println("Welcome to the spaceship generator!");
        while (control) {
            System.out.println("Please choose one of the options:");
            System.out.println("1. Create a Launch vehicle");
            System.out.println("2. Create a Cargo spaceship");
            System.out.println("3. Create a Manned spaceship");
            System.out.println("4. Create a Rover");
            System.out.println("5. Exit");
            option = optionInput.nextInt();
            
            switch(option) {
                case 1:
                    System.out.println("Please enter the name of the ship:");
                    name = nameInput.nextLine();
                    System.out.println("Please enter the mission of the ship:");
                    mission = missionInput.nextLine();
                    LaunchVehicle launcher = new LaunchVehicle(name,mission);
                    System.out.println("The spaceship has been created succesfully");
                    System.out.println(launcher);
                    control2 = true;
                    while(control2) {
                        System.out.println("You can use any of the following features of the ship:");
                        System.out.println("1. Launch ship");
                        System.out.println("2. Propel ship");
                        System.out.println("3. Set the ship status as: in orbit");
                        System.out.println("4. Exit");
                        option2 = option2Input.nextInt();
                        switch(option2) {
                            case 1:
                                launcher.launch();
                                System.out.println("Ship launched succesfully!");
                                System.out.println(launcher);
                                break;
                            case 2:
                                if (launcher.speed == 0) {
                                    System.out.println("You need to launch the ship before!");
                                } else {
                                    launcher.propel();
                                    System.out.println("Ship propelled succesfully!");
                                    System.out.println(launcher); 
                                }
                                break;
                            case 3:
                                if (launcher.speed <= 4000) {
                                    System.out.println("You must propel the ship so that it can reach orbit!");
                                } else {
                                    launcher.inOrbit();
                                    System.out.println("State of the ship updated successfully");
                                    System.out.println(launcher);
                                }
                                break;
                            case 4:
                                control2 = false;
                                break;
                            default:
                                System.out.println("The selected option does not exist");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please enter the name of the ship:");
                    name = nameInput.nextLine();
                    System.out.println("Please enter the mission of the ship:");
                    mission = missionInput.nextLine();
                    CargoSpacecraft cargo = new CargoSpacecraft(name,mission);
                    System.out.println("The spaceship has been created succesfully");
                    System.out.println(cargo);
                    control2 = true;
                    while(control2) {
                        System.out.println("You can use any of the following features of the ship:");
                        System.out.println("1. Launch ship");
                        System.out.println("2. Propel ship");
                        System.out.println("3. Set the ship status as: in orbit");
                        System.out.println("4. Exit");
                        option2 = option2Input.nextInt();
                        switch(option2) {
                            case 1:
                                cargo.launch();
                                System.out.println("Ship launched succesfully!");
                                System.out.println(cargo);
                                break;
                            case 2:
                                if (cargo.speed == 0) {
                                    System.out.println("You need to launch the ship before!");
                                } else {
                                    cargo.propel();
                                    System.out.println("Ship propelled succesfully!");
                                    System.out.println(cargo); 
                                }
                                break;
                            case 3:
                                if (cargo.speed <= 3500) {
                                    System.out.println("You must propel the ship so that it can reach orbit!");
                                } else {
                                    cargo.inOrbit();
                                    System.out.println("State of the ship updated successfully");
                                    System.out.println(cargo);
                                }
                                break;
                            case 4:
                                control2 = false;
                                break;
                            default:
                                System.out.println("The selected option does not exist");
                                break;
                        }
                    }
                    break;
                 case 3:
                    System.out.println("Please enter the name of the ship:");
                    name = nameInput.nextLine();
                    System.out.println("Please enter the mission of the ship:");
                    mission = missionInput.nextLine();
                    MannedSpaceship manned = new MannedSpaceship(name,mission);
                    System.out.println("The spaceship has been created succesfully");
                    System.out.println(manned);
                    control2 = true;
                    while(control2) {
                        System.out.println("You can use any of the following features of the ship:");
                        System.out.println("1. Launch ship");
                        System.out.println("2. Propel ship");
                        System.out.println("3. Set the ship status as: in orbit");
                        System.out.println("4. Land ship");
                        System.out.println("5. Exit");
                        option2 = option2Input.nextInt();
                        switch(option2) {
                            case 1:
                                manned.launch();
                                System.out.println("Ship launched succesfully!");
                                System.out.println(manned);
                                break;
                            case 2:
                                if (manned.speed == 0) {
                                    System.out.println("You need to launch the ship before!");
                                } else {
                                    manned.propel();
                                    System.out.println("Ship propelled succesfully!");
                                    System.out.println(manned); 
                                }
                                break;
                            case 3:
                                if (manned.speed <= 7.66) {
                                    System.out.println("You must propel the ship so that it can reach orbit!");
                                } else {
                                    manned.inOrbit();
                                    System.out.println("State of the ship updated successfully");
                                    System.out.println(manned);
                                }
                                break;
                            case 4:
                                if (manned.speed == 0) {
                                    System.out.println("You can't land a ship that hasn't taken off!");
                                } else {
                                    manned.landing();
                                    System.out.println("Ship landed succesfully!");
                                    System.out.println(manned);
                                }
                                break;
                            case 5:
                                control2 = false;
                                break;
                            default:
                                System.out.println("The selected option does not exist");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter the name of the ship:");
                    name = nameInput.nextLine();
                    System.out.println("Please enter the mission of the ship:");
                    mission = missionInput.nextLine();
                    Rover rover = new Rover(name,mission);
                    System.out.println("The spaceship has been created succesfully");
                    System.out.println(rover);
                    control2 = true;
                    while(control2) {
                        System.out.println("You can use any of the following features of the ship:");
                        System.out.println("1. Launch ship");
                        System.out.println("2. Propel ship");
                        System.out.println("3. Stop ship");
                        System.out.println("4. Exit");
                        option2 = option2Input.nextInt();
                        switch(option2) {
                            case 1:
                                rover.launch();
                                System.out.println("Ship launched succesfully!");
                                System.out.println(rover);
                                break;
                            case 2:
                                if (rover.speed == 0) {
                                    System.out.println("You need to launch the ship before!");
                                } else {
                                    rover.propel();
                                    System.out.println("Ship propelled succesfully!");
                                    System.out.println(rover); 
                                }
                                break;
                            case 3:
                                if (rover.speed == 0) {
                                    System.out.println("You can't stop a ship that hasn't taken off!");
                                } else {
                                    rover.stopping();
                                    System.out.println("Ship stopped succesfully!");
                                    System.out.println(rover);
                                }
                                break;
                            case 4:
                                control2 = false;
                                break;
                            default:
                                System.out.println("The selected option does not exist");
                                break;
                        }
                    }
                    break;
                case 5:
                    control = false;
                    break;
                default:
                    System.out.println("The selected option does not exist");
                    break;     
            }
        }
    }
}
