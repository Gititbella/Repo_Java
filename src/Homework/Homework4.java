package Homework;

import java.util.Locale;

public class Homework4 {
        public static void main(String[] args) {

            // Due - Jul 14 eod

            // Question - 1
            String sentence_1 = "hello dear, how are you?";
            int result_1 = 0;
            /**
             * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
             * else assign result_1 as 15
             *
             * use: Ternary operator
             *
             */
            int sentenceLength = sentence_1.length();
            System.out.println(sentenceLength);
            result_1 = sentenceLength >= 10 ?  100 : 15;
            System.out.println("result_1 = " + result_1);

            // Question - 2
            String sentence_2 = "We all ARe GOod ProgrAMmer";
            /**
             * replace all 'R/r' with 'F'
             */
            System.out.println(sentence_2);     // "We all AFe GOod PFogFAMmeF";
            String sentence2_AfterReplace = sentence_2.replace("r", "F");
            String sentence2_AfterReplace2 = sentence2_AfterReplace.replace("R", "F");
            System.out.println(sentence2_AfterReplace);
            System.out.println(sentence2_AfterReplace2);

            // Question - 3
            String sentence_3 = "ABC Networks";
            String result_3 = "";
            /**
             * 1. Display/Print length of your sentence_3
             * 2. does sentence_3 starts with "a" (ignore cases)
             * 3. does sentence_3 ends with "K" (ignore cases)
             * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
             *      else assign "Entertainment"
             *      Print the result_3 in console.
             */
            int sentence3Length = sentence_3.length();
            System.out.println(sentence3Length);
            boolean sentence3StartsWith_a = sentence_3.toLowerCase().startsWith("a");
            System.out.println(sentence3StartsWith_a);
            boolean sentence3EndsWith_K = sentence_3.toLowerCase().endsWith("K");
            System.out.println(sentence3EndsWith_K);
            result_3 = sentence_3.toLowerCase().startsWith("a") ? "Media" : "Entertainment";
            System.out.println(result_3);






        }

    }
