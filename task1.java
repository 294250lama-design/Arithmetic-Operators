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

System.out.println("-------------------------------------------------------");

       /* 
The distance between two cities (in km.) is input through the keyboard. Write a program to
convert and print this distance in meters, feet, inches and centimeters.
a. M=k*1000
b. Feet=k*3280.84
c. Inches=k*39370
d. Cm=k*100000
*/
System.out.println("Enter distance in km:");
double distance = input.nextDouble();
double meters = distance*1000;
double feet = distance*3280.84;
double inches = distance*39370;
double centimeters = distance*3280.84;
System.out.println("Distance in meters: "+meters);
System.out.println("Distance in feet: "+feet);
System.out.println("Distance in inches: "+inches);
System.out.println("Distance in centimeters: "+centimeters);

System.out.println("-------------------------------------------------------");

    /*
    If the marks obtained by a student in five different subjects are input through the keyboard,
find out the aggregate marks and percentage marks obtained by the student. Assume that
the maximum marks that can be obtained by a student in each subject is 100.
    */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first mark: ");
    double mark1 = input.nextDouble();
    System.out.println("Enter the second mark: ");
    double mark2 = input.nextDouble();
    System.out.println("Enter the third  mark: ");
    double mark3 = input.nextDouble();
    System.out.println("Enter the fourth mark: ");
    double mark4 = input.nextDouble();
    System.out.println("Enter the fifth mark: ");
    double mark5 = input.nextDouble();
    
    double aggerate = mark1 + mark2 + mark3 + mark4 + mark5;
    double average = aggerate / 5;
System.out.println("Aggerate: "+aggerate);
System.out.println("Average Marks: "+average);

System.out.println("-------------------------------------------------------");


/*
Temperature of a city in Fahrenheit degrees is input through the keyboard. Write a program
to convert this temperature into Centigrade degrees. (F.− 32) × 5/9
*/
System.out.println("Enter the temprature");
double temperature = input.nextDouble();
double degrees = (temperature -  32) * 5 / 9;
System.out.println("Temperature in degrees: "+degrees);

System.out.println("-------------------------------------------------------");


        /*Two numbers are input through the keyboard into two locations C and D. Write a program to
interchange the contents of C and D.*/
System.out.println("Enter number a");
int a = input.nextInt();
System.out.println("Enter number b");
int b = input.nextInt();

int temp = a;
 a=b;
 b=temp;
 System.out.println("A:"+a);
  System.out.println("B:"+b);

System.out.println("-------------------------------------------------------");


/*
If a five-digit number is input through the keyboard, write a program to calculate the sum of
its digits. (Hint: Use the modulus operator '%')
*/
Scanner input =new Scanner(System.in);
 System.out.println("Enter a five digit number: ");
int number = input.nextInt();
int d5 = number % 10;
number /= 10;

int d4 = number % 10;
number /= 10;

int d3 = number % 10;
number /= 10;

int d2 = number % 10;
 number /= 10;

int d1 = number % 10;

int sum =  d5 + d4 + d3 + d2 + d1;

System.out.println("Sum: "+sum);

System.out.println("-------------------------------------------------------");

/*
If a five-digit number is input through the keyboard, write a program to reverse the number.

*/
Scanner input =new Scanner(System.in);
 System.out.println("Enter a five digit number: ");
int number = input.nextInt();
int d5 = number % 10;
number /= 10;

int d4 = number % 10;
number /= 10;

int d3 = number % 10;
number /= 10;

int d2 = number % 10;
 number /= 10;

int d1 = number % 10;

int reversed_number = d5 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;

System.out.println("Sum: "+reversed_number);

System.out.println("-------------------------------------------------------");

/*
If a four-digit number is input through the keyboard, write a program to obtain the sum of the
first and last digit of this number.
*/
Scanner input =new Scanner(System.in);
 System.out.println("Enter a five digit number: ");
int number = input.nextInt();

int d4 = number % 10;
number /= 10;

int d3 = number % 10;
number /= 10;

int d2 = number % 10;
 number /= 10;

int d1 = number % 10;

int sum =  d4+d1;

System.out.println("Sum: "+sum);

System.out.println("-------------------------------------------------------");

/*
In a town, the percentage of men is 52. The percentage of total literacy is 48. If total
percentage of literate men is 35 of the total population, write a program to find the total
number of illiterate men and women if the population of the town is 80,000.
*/
         double population = 80000.0;
        
        double men = population * 0.52;
        double women = population * 0.48;

        double literateMen = population * 0.35;
        double literateTotal = population * 0.48;
        double literateWomen = literateTotal - literateMen;

        double illiterateMen = men - literateMen;
        double illiterateWomen = women - literateWomen;

        System.out.println("Illiterate men: " + illiterateMen);
        System.out.println("Illiterate women: " + illiterateWomen);

    }
}
