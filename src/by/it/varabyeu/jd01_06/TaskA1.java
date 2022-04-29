package by.it.varabyeu.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern compile = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = compile.matcher(Poem.text);
        while (matcher.find()){
            int start = matcher.start();
            builder.setCharAt(start+3, '#');
            if (matcher.group().length() >= 7){
                builder.setCharAt(start+6, '#');
            }
        }
        System.out.println(builder);
    }
}

