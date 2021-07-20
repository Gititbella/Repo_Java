package Homework;

public class Homework5 {
    public static void main(String[] args) {

        // Due: July 18

        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        String threeWordSentence_1 = "hApPy nEW yeAr";
        System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"

        // convert to lowercase
        //split words
        //change first letters of each word to uppercase
        //combine

        String threeWordSentenceLowerCase = threeWordSentence_1.toLowerCase();
        String[] threeWordsSentenceSplit = threeWordSentenceLowerCase.split("");
        String firstWord = threeWordsSentenceSplit[0].substring(0,1).toUpperCase() + threeWordsSentenceSplit[0].substring(1);
        String secondWord = threeWordsSentenceSplit[1].substring(0,1).toUpperCase() + threeWordsSentenceSplit[1].substring(1);
        String thirdWord = threeWordsSentenceSplit[2].substring(0,1).toUpperCase() + threeWordsSentenceSplit[2].substring(1);
        threeWordSentence_1 = firstWord + " " + secondWord + " " + thirdWord;
        System.out.println("After code : " + threeWordSentence_1);      // "Happy New Year"

        // Question - 2:
        String threeWordSentence_2 = "very gOOD MorNING";
        String abbr = "";

        //convert to lowercase
        //split words from the sentence
        //convert letters to uppercase
        //abbreviate

        threeWordSentence_2 = threeWordSentence_2.toLowerCase();
        String[] threeWordsSentence_2_Split = threeWordSentence_2.split(" ");
        String firstLetter = threeWordsSentence_2_Split[0].substring(0,1).toUpperCase();
        String secondLetter = threeWordsSentence_2_Split[1].substring(0,1).toUpperCase();
        String thirdLetter = threeWordsSentence_2_Split[2].substring(0,1).toUpperCase();\
        abbr = firstLetter + secondLetter + thirdLetter;
        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM


        // Question - 3:
        /**
         * print the number of words in the sentence.
         */
        String sentence_3 = "We all are here to learn programming and testing";
        String[] sentence3_Split = sentence3.split(" ");
        System.out.println("Length of the third sentence is: "+sentence3_Split.length);

    }
}
