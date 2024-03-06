import java.util.Scanner;
public class UserInterface {
    private Points points;
    private Scanner scanner;
    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }
    public void start() {
        readInput();
        prints();
    }
    public void readInput() {
        System.out.println("Enter point totals, - 1 stops:");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                points.addPoints(input);
                points.pointsToGrades();
            }
        }
    }
    public void prints() {
        System.out.println("Point average (all): " + points.pointsAverage());
        printingPassingAverage();
        System.out.println("Pass percentage: " + points.passPercentage());
        printingGrades();
    }
    public void printingPassingAverage() {
        if (points.passedAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + points.passedAverage());
        }
    }
    public void printingGrades() {
        int grade = 5;
        System.out.println("Grade distribution: ");
        while (grade >= 0) {
            System.out.print(grade + ": ");
            int stars = points.numberOfGrades(grade);
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }
    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
