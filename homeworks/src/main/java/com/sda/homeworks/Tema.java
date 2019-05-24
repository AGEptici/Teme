package com.sda.homeworks;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class Tema {

    public static void main(String[] args) {

        System.out.println("* The raw version of the text is: ");
        System.out.println(TextTema.TEXT);
        System.out.println();


        System.out.println("* The cleaned-up version of the text is: ");
        String clean = TextTema.TEXT.replaceAll("[\\d[^\\w\\s]]+",
                        " ").replaceAll("(\\s{2,})", " ");
        {
            System.out.println(clean);
        }
        Map<String, AtomicInteger> dictionaryWords = new HashMap<>();
        String[] cleanStringWords = clean.split(" ");
        for (int i = 0; i < cleanStringWords.length; i++) {
            dictionaryWords.putIfAbsent(cleanStringWords[i], new AtomicInteger(0));
            dictionaryWords.get(cleanStringWords[i]).incrementAndGet();
        }


        System.out.println();
        System.out.println("* The dictionary containes the following results: \"words=frequency\": ");
        System.out.println(dictionaryWords);

    }
}


