package src.com.java.basics.array;

import java.util.Arrays;

public class Employeeidandsalary {
    public static void main(String[]args) {
        String[][] Employee = new String[5][2];
        Employee[0][0]="Dhanushya2418";
        Employee[0][1]="40,000";
        Employee[1][0]="zaraa";
        Employee[1][1]="35,000";
        for (String[]Employees:Employee) {
            System.out.println(Arrays.toString(Employees));
        }
    }
}