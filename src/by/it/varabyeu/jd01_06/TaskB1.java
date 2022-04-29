package by.it.varabyeu.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    public static void main(String[ ] args){
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern compile = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = compile.matcher(Poem.text);

    }
}
