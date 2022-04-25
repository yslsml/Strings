package string.handler;

import string.read.ReadData;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandler {
    public static final String REGEX_RU =  "(^|[^а-яА-ЯёЁ]+)([яыуаиеоюэЯЫУАИЕОЮЭ])([а-яА-ЯёЁ]*[яыуаиеоюэЯЫУАИЕОЮЭ]|)[^а-яА-ЯёЁ]+"; //"^|\\s+[яыуаиеёоюэЯЫУАИЕЁОЮЭ].*[яыуаиеёоюэЯЫУАИЕЁОЮЭ]+\\s+"; //  "\\d+" - только со знаком плюс
    public static final String REGEX_ENG = "(^|[^a-zA-Z]+)([aeuioAEUIO])([a-zA-Z]*[aeuioAEUIO]|)[^a-zA-Z]+";

    public static int countWordsWithVowel (String path) throws IOException {
        StringBuilder poem = ReadData.readData(path);

        Pattern patternRu = Pattern.compile(REGEX_RU);
        Pattern patternEng = Pattern.compile(REGEX_ENG);
        Matcher matcherRu = patternRu.matcher(poem);
        Matcher matcherEng = patternEng.matcher(poem);

        int count = 0;
        while (matcherRu.find() || matcherEng.find()) {
            count++;
        }
        return count;
    }
}
