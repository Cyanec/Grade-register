import java.util.ArrayList;
public class Points {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passed;
    private ArrayList<Integer> grades;
    public Points() {
        this.points = new ArrayList<>();
        this.passed = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public void addPoints(int toAdd) {
        points.add(toAdd);
        if (toAdd >= 50) {
            passed.add(toAdd);
        }
    }
    public double average(ArrayList<Integer> array) {
        double average = 1.0*sum(array)/array.size();
        return average;
    }
    public int sum(ArrayList<Integer> array) {
        int sum = 0;
        for (int next: array) {
            sum = sum + next;
        }
        return sum;
    }
    public double percentage() {
        double percentage = 100*passed.size()/points.size();
        return percentage;
    }
    public double pointsAverage() {
        if (points.isEmpty()) {
            return -1;
        } else {
            return average(points);
        }
    }
    public double passedAverage() {
        if (passed.isEmpty()) {
            return -1;
        } else {
            return average(passed);
        }
    }
    public double passPercentage() {
        if (passed.isEmpty()) {
            return 0;
        } else {
            return percentage();
        }
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int next: grades) {
            if (next == grade) {
                count++;
            }
        }
        return count;
    }
    public void pointsToGrades() {
        int grade = 0;
        for (int next: points) {
            if (next < 50) {
                grade = 0;
            } else if (next < 60) {
                grade = 1;
            } else if (next < 70) {
                grade =2;
            } else if (next < 80) {
                grade = 3;
            } else if (next < 90) {
                grade = 4;
            } else {
                grade = 5;
            }
        }
        grades.add(grade);
    }
    @Override
    public String toString() {
        return "Points{" +
                "points=" + points +
                '}';
    }
}
