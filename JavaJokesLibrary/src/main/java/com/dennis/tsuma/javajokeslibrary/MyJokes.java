package com.dennis.tsuma.javajokeslibrary;

import java.util.Random;

public class MyJokes {
    private static String[] jokes = {
            "What do you call a 3 humped camel? a pregnant camel!",
            "What did the green light tell the red light at the traffic stop? \"Don't look I'm changing!\"",
            "Where did the bull take the cow on their first date? To the mooovies!",
            "What did the skeleton order in the hotel? Spare ribs",
            "I have run out of jokes!"};
    public String getJoke(){
        return jokes[new Random().nextInt(jokes.length)];
    }
}
