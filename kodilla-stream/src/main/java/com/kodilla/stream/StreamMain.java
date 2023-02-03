package com.kodilla.stream;                                                 // [1]

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {                                                   // [4]

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //Adding three exclamation marks and the beginning and at the and of String "text"
        PoemDecorator add3ExclamationMarks = text ->"!!! " + text + " !!!";
        poemBeautifier.beautify ("text", add3ExclamationMarks);

        //changing letters in text to capital letters
        PoemDecorator toUpperText = text -> text.toUpperCase();
        poemBeautifier.beautify("text", toUpperText);

        //Adding three ### and the beginning and at the and of String "text"
        PoemDecorator addHasztags = text -> "### " + text + " ###";
        poemBeautifier.beautify("text", addHasztags);
    }
}