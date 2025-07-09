import java.util.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("enter the year(only year)");
        int Year=inputScanner.nextInt();
        int currentYear=LocalDate.now().getYear();
        int age=currentYear-Year;
        System.out.println(age);
    }
}