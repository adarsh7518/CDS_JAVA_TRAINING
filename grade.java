import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int grade = scanner.nextInt();
    switch (grade) {
        case 10:
            break;
        case 50:

         System.out.println("Passed the grade D");
         break;
        case 80:
             System.out.println("Passed the grade B");
            break;
        case 90:
            System.out.println("Passed the grade A");
            break;
        default:
            System.out.println("Marks not match");
            break;
    }
    }
}