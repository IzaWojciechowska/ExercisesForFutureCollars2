package com.futurecollars.lesson5.task1;

public class TextUtils {

    public static void main(String[] args) {

        String text = "kajak";

        checkText(text);

        }

    public static void checkText(String text) {

        if (text.length() == 0) {

            System.out.println("Text has no characters");
        } else {

            int textLength = text.length();
            String textBackwards = "";
            int n = (textLength - 1);

            for (int i = 0; i < textLength; i++) {

                textBackwards = textBackwards + text.charAt(n);
                n--;
            }

            if (text.equals(textBackwards)) {

                System.out.println("Your text is a palindrome:  " + text +" - " + textBackwards);
                System.out.println("Length of the text is: " + textLength);
            } else {

                System.out.println("Text is not a palindrome.");
            }
        }
    }


}



