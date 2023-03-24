package com.kodilla.stream;                                                 // [1]

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {                                                   // [4]

    public static void main(String[] args) {

        // Exercise 1
        System.out.println("...............Task 1...............");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //Adding three exclamation marks and the beginning and at the end of String "text"
        PoemDecorator add3ExclamationMarks = text -> "!!! " + text + " !!!";
        poemBeautifier.beautify("text", add3ExclamationMarks);

        //changing letters in text to capital letters
        PoemDecorator toUpperText = String::toUpperCase;
        poemBeautifier.beautify("text", toUpperText);

        PoemDecorator add90 = text -> "90" + text + "90";
        poemBeautifier.beautify(" 90 ", add90);

        //Adding three ### and the beginning and at the end of String "text"
        PoemDecorator addHashtags = text -> "### " + text + " ###";
        poemBeautifier.beautify("text", addHashtags);


        // Exercise 3
        System.out.println("...............Task 2...............");
        Forum forum = new Forum(List.of(
                new ForumUser(1,"user1",'M',LocalDate.of(2010, 1,23), 10),
                new ForumUser(2,"user2",'M',LocalDate.of(1997, 12,3), 1),
                new ForumUser(3,"user3",'M',LocalDate.of(2000, 1,11), 15)
        ));
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        resultMap.entrySet().stream()
              .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
   }
}


