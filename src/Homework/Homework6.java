package Homework;

public class Homework6 {
    public static void main(String[] args) {

        // Due: July 21

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        int studentScore = 80;
        int maxScore = 150;
        // calculate percentage --> 80*100/150
        // print result like:
        // Your percentage: XX.yy and your Grade is: Z

        double percent = studentScore * 100 / maxScore;
        if (percent >= 91) {
            System.out.println("Your percentage is " + percent + " and your grade is 'A'");
        } else if (percent >= 81) {
            System.out.println("Your percentage is " + percent + " and your grade is 'B'");
        } else if (percent >= 71) {
            System.out.println("Your percentage is " + percent + " and your grade is 'C'");
        } else if (percent >= 61) {
            System.out.println("Your percentage is " + percent + " and your grade is 'D'");
        } else if (percent >= 51) {
            System.out.println("Your percentage is " + percent + " and your grade is 'E'");
        } else (percent < 50) {
            System.out.println("Your percentage is " + percent + " and your grade is 'F'");
        }

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int num1 = 10;
        int num2 = num1 % 3;
        int num3 = num1 % 5;

        if (num2 == 0 && num3 == 0) {
            System.out.println("Divisible by both");
        } else if (num3 == 0) {
            System.out.println("Divisible by 5");
        } else if (num2 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println(num1);
        }








    }


}
