package com.mobile.aws_rekognition.jokeslib;

import java.util.Random;

public class MyJokes {

    public static String getRandomJoke(){
        Random random =new Random();
        return jokes[random.nextInt(jokes.length)];
    }

    private static String[] jokes =
            {"Can a kangaroo jump higher than a house? \n" +
            "-\n" +
            "Of course, a house doesn’t jump at all.\n",
            "Anton, do you think I’m a bad mother?\n" +
                    "\n" +
                    "My name is Paul.\n",
            "Q. How does a computer get drunk? A. It takes screenshots.",
            "Why are iPhone chargers not called Apple Juice?!\n",
            "Q. Why did the PowerPoint Presentation cross the road? A. To get to the other slide.",
            "PATIENT: Doctor, I need your help. I’m addicted to checking my Twitter! DOCTOR: I’m so sorry, I don’t follow.",
            "Have you heard of that new band “1023 Megabytes”? They’re pretty good, but they don’t have a gig just yet.",
            "My computer suddenly started belting out “Someone Like You.” It’s a Dell.",
            "I saw a driver texting and driving. It made me so mad I threw my beer at him.",
            "\"I am hungary.\"\n" +
                    "\n" +
                    "\"Maybe you should czech the fridge.\"\n" +
                    "\n" +
                    "\"I'm russian to the kitchen.\"\n" +
                    "\n" +
                    "\"Is there any turkey?\"\n" +
                    "\n" +
                    "\"We have some, but it's covered in greece\"\n" +
                    "\n" +
                    "\"ew, there's norway I'd eat that!\"\n" +
                    "\n"};
}
