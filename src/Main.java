import java.util.Scanner;
public class Main {
    public static void moveRobot(Robot robot, int toX, int toY) {
        Scanner in = new Scanner(System.in);
        toX = new Scanner(System.in).nextInt();
        toY = new Scanner(System.in).nextInt();
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) robot.turnRight();
            while (robot.getY() < toY) robot.stepForward();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
            while (robot.getY() > toY) robot.stepForward();
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
            while (robot.getX() < toX) robot.stepForward();
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) robot.turnRight();
            while (robot.getX() > toX) robot.stepForward();
        }
    }
}

