package string.run;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import string.handler.StringHandler;

/**
 * В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
 */

public class Main {
    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        try {
            int res1 = StringHandler.countWordsWithVowel("data/infoRU.txt");
            int res2 = StringHandler.countWordsWithVowel("data/infoENG.txt");

            logger.log(Level.INFO, "Number of words with vowels in the beginning and in the end in 1st poem is " + res1);
            logger.log(Level.INFO, "Number of words with vowels in the beginning and in the end in 2nd poem is " + res2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}