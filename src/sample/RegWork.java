package sample;

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegWork {
    private Pattern patternLink;
    private Pattern pattern;
    private Matcher matcher;
    private Matcher matcher1;
    private String input;

    RegWork(String textFieldString) {
        this.patternLink = Pattern.compile("<a.*?href ?= ?['\\\"]([^'\\\"]*)['\\\"].*?>(.*?)<\\/a>", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        this.pattern = Pattern.compile("(https?:\\/\\/)?([\\w-]{1,}\\.[\\w-]{1,})[^\\s]*$", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        this.input = textFieldString;
    }

    public void setText(String textFieldString) {
        this.input = textFieldString;
    }

    public String outRegString() {
        try (BufferedReader bufferedReader = new BufferedReader(new StringReader(this.input))) {
            StringBuilder result = new StringBuilder();
            String inputLine = "";
            while ((inputLine = bufferedReader.readLine()) != null) {
                matcher = patternLink.matcher(inputLine);
                matcher1 = pattern.matcher(inputLine);
                if (matcher.find()) {
                    result.append(matcher.group(1) + "\t" + matcher.group(2) + "\n");
                } else if (matcher1.find()) {
                    result.append(matcher1.group(1) + matcher1.group(2) + "\n");
                }
            }
            return result.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return "123";
    }
}
