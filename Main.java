import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Points points = new Points();
        UserInterface userInterface = new UserInterface(points, scanner);

        userInterface.start();
    }
}
