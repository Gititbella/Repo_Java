package Homework;

public class Homework3 {

    public static void main(String[] args) {


    /**
     *
     * Due: July 8
     *
     Store below scenario value in an appropriate dataType variable, and print the same in console
     1. number of hours in a day (byte)
     2. max # of days in a year
     3. total # of EEs in an organization
     4. population in a country
     5. mortgage rate
     6. balance in a bank account
     7. does the sun rise from the west? Store answer
     8. initials of your name (^use: char)
         // My initials: AB
     */

    byte numHoursInDay = 24;
        System.out.println("There are " + numHoursInDay + " hours in a day");
    short numDaysInYear =365;
        System.out.println("There are " + numDaysInYear + " days in a year");
    short numTotalEmployees = 5000;
        System.out.println("There are " + numTotalEmployees + " in my company");
    long totalUsPopulation = 328200000L;
        System.out.println("There are " + totalUsPopulation + "people in the US");
    float mortgageRate = 2.25f;
        System.out.println("The current mortgage rate: " + mortgageRate);
    double accountBalance = 100000.88;
        System.out.println("Account Balance : " + accountBalance);
    boolean sunRiseFromTheWest = false;
        System.out.println("Does the sun rise from the west?" + sunRiseFromTheWest);
    char firstName = 'I';
    char lastName = 'S';
        System.out.println("My Initials: " + firstName + lastName);

        /**
         *
         * Convert Celcius to Fahrenheit
         *
         */
        double cTemp = 100;
        double fTemp = cTemp * 9/5 +32;
        System.out.println(cTemp+" degrees celcius is equal to "+fTemp+" degrees fahrenheit.");
        /**
         *
         * Reverse
         *
         */
        fTemp = 100;
        cTemp = (fTemp-32)*5/9;
        System.out.println(fTemp+" degrees fahrenheit is equal to "+cTemp+" degrees celcius.");

        /**
         *
         * Convert Celcius to Kelvin
         *
         */
        double newCTemp = 0;
        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + " degrees celcius is equal to " + kTemp + " degrees kelvin.");

        /**
         *
         * Reverse
         *
         */

        double newCTemp;
        double kTemp = cTemp-273.15;
        System.out.println(kTemp + " degrees kelvin is equal to " + cTemp + " degrees celcius.");

        /**
         *
         *
         *
         */
    }
}

