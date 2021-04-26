package StartPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void show(List<Word> textToParse) {
        int outputController = 0;
        for (Word word : textToParse) {
            if (outputController == 15) {
                outputController = 0;
                System.out.println();
            }
            System.out.print(word + " ");
            outputController++;
        }
    }
    public static boolean startsWithVovel(String s) {
        return s.length() > 0 && !FirstConsonantComparator.isConsonant(s.charAt(0));
    }

    public static void main(String[] args) throws FileNotFoundException {
        MyParsing myParsing = new MyParsing();
        List<Word> text = myParsing.parse(new File("src\\StartPack\\inputText.txt"));
        show(text);
        System.out.println();

        String text2 = "package by.bsu.resource;\n" +
                "import java.util.Locale;\n" +
                "public class ResourceManagerRun {\n" +
                "public static void main(String[ ] args) {\n" +
                " ResourceManager manager = ResourceManager.INSTANCE;\n" +
                " System.out.println(manager.getString(\"str1\"));\n" +
                " manager.changeResource(new Locale(\"be\",\"BY\"));\n" +
                " System.out.println(manager.getString(\"str1\"));\n" +
                "}\n" +
                "}\n" +
                "Качественно разработанное приложение обычно не содержит литералов типа String.\n" +
                "Все необходимые сообщения хранятся вне системы, в частности, в properties файлах.\n" +
                "Что позволяет без перекомпиляции кода безболезненно изменять любое сообщение или информацию, хранящуюся вне классов системы.\n" +
                "+375(33)399-77-88\n" +
                "str@mail.ru  cts@docker.com";
        List<String> words = new LinkedList<String>(Arrays.asList(text2.split("[\\s\\p{Punct}]+")));
        Collections.sort(words, FirstConsonantComparator.getInstance());

        int i = 0;

        for (ListIterator<String> iterator = words.listIterator(); iterator.hasNext(); ) {
            if (!startsWithVovel(iterator.next()))
                iterator.remove();
        }
        System.out.println(words);
    }
}
