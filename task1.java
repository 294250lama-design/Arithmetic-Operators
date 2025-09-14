import java.util.Scanner;

public class task1 {
    public static void main(String[] args)
    {
/*
1. Ramesh's basic salary is input through the keyboard. His dearness allowance is 40% of
basic salary, and house rent allowance is 20% of basic salary. Write a program to calculate
his gross salary.
*/
Scanner input  = new Scanner(System.in);
System.out.println("Enter your salary");
double salary = input.nextInt();
double dearness = salary * 0.40;
double rent = salary * 0.20;
double gross = salary + rent;
System.out.println("Dearness Allowance: "+dearness);
System.out.println("Rent: "+rent);
System.out.println("Gross Salary: "+gross);


    }
}
