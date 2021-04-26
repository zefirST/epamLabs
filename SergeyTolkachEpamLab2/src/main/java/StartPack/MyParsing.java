package StartPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyParsing implements Parsing {
    private String mailRExpr = "([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{1,8}";
    private String phoneRExpr = "\\+\\d{3}\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}\\b";
    private String wordRExpr = "\\b([a-zA-Zа-яА-ЯёЁ_']+)\\b";

    public String getMailRExpr() {
        return mailRExpr;
    }

    public String getPhoneRExpr() {
        return phoneRExpr;
    }

    public String getWordRExpr() {
        return wordRExpr;
    }

    public void setMailRegex(String mailRExpr) {
        this.mailRExpr = mailRExpr;
    }

    public void setPhoneRegex(String phoneRExpr) {
        this.phoneRExpr = phoneRExpr;
    }

    public void setWordRegex(String wordRExpr) {
        this.wordRExpr = wordRExpr;
    }

    @Override
    public List<Word> parse(File file) throws FileNotFoundException {
        Scanner fScanner = new Scanner(file);
        List<Word> textToParse = new ArrayList<>();

        Pattern phonePattern = Pattern.compile(phoneRExpr);
        Pattern mailPattern = Pattern.compile(mailRExpr);
        Pattern wordPattern = Pattern.compile(wordRExpr);

        while (fScanner.hasNextLine()) {
            String line =fScanner.nextLine();

            Matcher phoneMatcher = phonePattern.matcher(line);
            Matcher mailMatcher = mailPattern.matcher(line);
            Matcher wordMatcher = wordPattern.matcher(line);

            while (mailMatcher.find()) {
                textToParse.add(new Word(mailMatcher.group()));
                line = line.replace(mailMatcher.group(), "");
            }
            while (phoneMatcher.find()) {
                textToParse.add(new Word(phoneMatcher.group()));
                line = line.replace(phoneMatcher.group(), "");
            }
            while (wordMatcher.find()) {
                textToParse.add(new Word(wordMatcher.group()));
            }

        }
        fScanner.close();
        return textToParse;
    }
}
