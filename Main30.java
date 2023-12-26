import java.util.Scanner;

interface Student {
    void Mark();
}

class Grade implements Student {
    double sum;
    Scanner scanner = new Scanner(System.in);

    public void Mark() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter mark: ");
            int mark = scanner.nextInt();
            sum += mark;
        }
        System.out.println("The average marks is " + (sum / 5));
    }
}

public class Main30 {
    public static void main(String[] args) {
        Grade grade = new Grade();
        grade.Mark();
    }
}