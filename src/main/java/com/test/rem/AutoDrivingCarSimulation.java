package com.test.rem;
public class AutoDrivingCarSimulation {
    public static void main(String[] args) {
        // Sample input
        String input = "10 10\n1 2 N\nFFRFFFRRLF";

        // Parse input
        String[] lines = input.split("\n");
        String[] dimensions = lines[0].split(" ");
        int width = Integer.parseInt(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
        String[] position = lines[1].split(" ");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        char direction = position[2].charAt(0);
        String commands = lines[2];

        // Simulate movement
        simulate(width, height, x, y, direction, commands);
    }

    public static void simulate(int width, int height, int x, int y, char direction, String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'F':
                    switch (direction) {
                        case 'N':
                            if (y < height - 1) y++;
                            break;
                        case 'E':
                            if (x < width - 1) x++;
                            break;
                        case 'S':
                            if (y > 0) y--;
                            break;
                        case 'W':
                            if (x > 0) x--;
                            break;
                    }
                    break;
                case 'L':
                    direction = turnLeft(direction);
                    break;
                case 'R':
                    direction = turnRight(direction);
                    break;
            }
        }

        // Output final position and direction
        System.out.println(x + " " + y + " " + direction);
    }

    public static char turnLeft(char direction) {
        switch (direction) {
            case 'N':
                return 'W';
            case 'E':
                return 'N';
            case 'S':
                return 'E';
            case 'W':
                return 'S';
            default:
                return direction;
        }
    }

    public static char turnRight(char direction) {
        switch (direction) {
            case 'N':
                return 'E';
            case 'E':
                return 'S';
            case 'S':
                return 'W';
            case 'W':
                return 'N';
            default:
                return direction;
        }
    }
}