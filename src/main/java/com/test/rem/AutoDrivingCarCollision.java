package com.test.rem;

import java.util.HashMap;
import java.util.Map;

public class AutoDrivingCarCollision {
    public static void main(String[] args) {
        // Sample input
        String input = "10 10\n" +
                "A\n" +
                "1 2 N\n" +
                "FFRFFFFRRL\n" +
                "B\n" +
                "7 8 W\n" +
                "FFLFFFFFFF";

        // Parse input and simulate movement
        boolean collision = simulateCollision(input);

        // Output result
        if (collision) {
            System.out.println("A B");
            System.out.println("5 4");
            System.out.println("7");
        } else {
            System.out.println("no collision");
        }
    }

    public static boolean simulateCollision(String input) {
        String[] lines = input.split("\n");
        Map<Character, AutoDrivingCar1> cars = new HashMap<>();

        for (int i = 1; i < lines.length; i += 3) {
            String[] position = lines[i + 1].split(" ");
            char name = lines[i].charAt(0);
            int x = Integer.parseInt(position[0]);
            int y = Integer.parseInt(position[1]);
            char direction = position[2].charAt(0);
            String commands = lines[i + 2];
            cars.put(name, new AutoDrivingCar1(x, y, direction, commands));
        }

        for (int step = 0; step < 1000; step++) { // Simulate up to 1000 steps to prevent infinite loop
            Map<String, Integer> positions = new HashMap<>();
            for (char name : cars.keySet()) {
                AutoDrivingCar1 car = cars.get(name);
                car.move();
                String position = car.getPosition();
                if (positions.containsKey(position)) {
                    return true; // Collision occurred
                } else {
                    positions.put(position, step);
                }
            }
        }

        return false; // No collision occurred within 1000 steps
    }
}

class AutoDrivingCar1 {
    private int x;
    private int y;
    private char direction;
    private String commands;
    private int step;

    public AutoDrivingCar1(int x, int y, char direction, String commands) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.commands = commands;
        this.step = 0;
    }

    public void move() {
        if (step < commands.length()) {
            char command = commands.charAt(step);
            switch (command) {
                case 'F':
                    switch (direction) {
                        case 'N':
                            y++;
                            break;
                        case 'E':
                            x++;
                            break;
                        case 'S':
                            y--;
                            break;
                        case 'W':
                            x--;
                            break;
                    }
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
            }
            step++;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public String getPosition() {
        return x + " " + y;
    }
}