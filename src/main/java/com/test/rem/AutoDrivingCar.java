package com.test.rem;

public class AutoDrivingCar {
    // Define directions as constants
    private static final char NORTH = 'N';
    private static final char EAST = 'E';
    private static final char SOUTH = 'S';
    private static final char WEST = 'W';

    private int x;
    private int y;
    private char direction;
    private int width;
    private int height;

    public AutoDrivingCar(int width, int height, int x, int y, char direction) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'F':
                    moveForward();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
            }
        }
    }

    private void moveForward() {
        switch (direction) {
            case NORTH:
                if (y < height - 1) y++;
                break;
            case EAST:
                if (x < width - 1) x++;
                break;
            case SOUTH:
                if (y > 0) y--;
                break;
            case WEST:
                if (x > 0) x--;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    public String getPositionAndDirection() {
        return x + " " + y + " " + direction;
    }

    public static void main(String[] args) {
        // Sample input
        int width = 10;
        int height = 10;
        int initialX = 1;
        int initialY = 2;
        char initialDirection = 'N';
        String commands = "FFRFFFRRLF";

        // Create the auto-driving car instance
        AutoDrivingCar car = new AutoDrivingCar(width, height, initialX, initialY, initialDirection);

        // Execute commands
        car.executeCommands(commands);

        // Output final position and direction
        System.out.println(car.getPositionAndDirection());
    }
}
