import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("Введите конечные координат робота: \nX = ");
        int toX = new Scanner(System.in).nextInt();
        System.out.print("Y = ");
        int toY = new Scanner(System.in).nextInt();
        Robot Tom = new Robot();
        Main.moveRobot(Tom, toX, toY);
    }
    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) robot.turnRight();
            while (robot.getY() < toY) robot.stepForward();
            System.out.println("Yкон = " + robot.getY());
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
            while (robot.getY() > toY) robot.stepForward();
            System.out.println("Yкон = " + robot.getY());
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
            while (robot.getX() < toX) robot.stepForward();
            System.out.print("Xкон = " + robot.getX());
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) robot.turnRight();
            while (robot.getX() > toX) robot.stepForward();
            System.out.print("Xкон = " + robot.getX());
        }
    }
}

