package com.example.user.wordcount;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounterTest {

    @Test
    public void countWordsTest() {
        WordCounter wordcounter = new WordCounter();
        String string = "This is a string of words";
        assertEquals(6, wordcounter.count(string));

        }

}


