package com.company.codingTest;
import java.util.Locale;

public class WordPandYCount {
    boolean solution(String s) {
        String s1 = s.toLowerCase(Locale.ROOT);
        long count = s1.chars().filter(c -> c == 'p').count();
        long count1 = s1.chars().filter(c -> c == 'y').count();
        if (count == count1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        WordPandYCount wordPandYCount = new WordPandYCount();
        boolean pPoooyY = wordPandYCount.solution("pPoooyY");
        System.out.println();
    }
}
