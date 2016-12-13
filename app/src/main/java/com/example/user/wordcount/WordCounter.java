package com.example.user.wordcount;

import java.util.Scanner;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter {

    public int count (String string){

    String words[] = string.split(" ");
        int result = words.length;
        return result;
    }



}
