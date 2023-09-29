import javax.swing.*;
import java.util.Scanner;
public class assignment1dsa {
    public static void main(String[] args) {
        //QUESTION1
        System.out.println("*****");
        System.out.println("    *");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");

        //QUESTION2
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();


        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80) {
            System.out.println("good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets expectation");
        }
        //QUESTION3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }


    //QUESTION4
    {


        Scanner scn = new Scanner(System.in);
        int small = scn.nextInt();
        int big = scn.nextInt();
        for (int n = small; n <= big; n++)
            System.out.println(n);


    }

    //QUESTION5
    {
        int count = 0, num = 89790834;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }

    //QUESTION6
    {
        int num = 78, reversed = 0;

        System.out.println("Original Number: " + num);


        while (num != 0) {


            int digit = num % 10;
            reversed = reversed * 10 + digit;


            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

    //QUESTION7
    {
        Scanner scn = new Scanner(System.in);
        {
            int n = scn.nextInt();

            int i = 0;
            int p = 1;
            while (n > 0) {
                int dig = n % 10;
                n = n / 10;
                i += p * Math.pow(10, dig - 1);
                p++;


                System.out.println(i);
            }
        }
        //QUESTION9
        {

            int num1 = scn.nextInt();
            int num2 = scn.nextInt();

            int tnum1 = num1;
            int tnum2 = num2;

            while (tnum1 % tnum2 != 0) {
                int rem = tnum1 % tnum2;
                tnum1 = tnum2;
                tnum2 = rem;
            }

            int gcd = tnum2;
            int lcm = (num1 * num2) / gcd;

            System.out.println(gcd);
            System.out.println(lcm);
        }
        //QUESTION10
        int n = scn.nextInt();

        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if(n != 1)
            System.out.print(n);
    }
}

