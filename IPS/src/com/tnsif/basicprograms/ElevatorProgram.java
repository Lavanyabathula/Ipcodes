package com.tnsif.basicprograms;

import java.util.Scanner;

class Elevator {
    private int currentFloor;
    private int totalFloors;

    public Elevator(int totalFloors) {
        this.currentFloor = 1;
        this.totalFloors = totalFloors;
    }

    public void goToFloor(int floor) {
        if (floor > 0 && floor <= totalFloors) {
            System.out.println("Elevator moving from floor " + currentFloor + " to floor " + floor);
            currentFloor = floor;
            System.out.println("Elevator has arrived at floor " + currentFloor);
        } else {
            System.out.println("Invalid floor selection!");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

public class ElevatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of floors in the building: ");
        int totalFloors = scanner.nextInt();
        Elevator elevator = new Elevator(totalFloors);

        System.out.println("Elevator initialized. Current floor: " + elevator.getCurrentFloor());

        int selectedFloor;
        do {
            System.out.print("Select a floor to go (1 - " + totalFloors + ") or enter 0 to exit: ");
            selectedFloor = scanner.nextInt();

            if (selectedFloor != 0) {
                elevator.goToFloor(selectedFloor);
            }
        } while (selectedFloor != 0);

        System.out.println("Program exited. Elevator final position: " + elevator.getCurrentFloor());
    }
}

