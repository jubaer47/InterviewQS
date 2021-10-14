package com.code;

import com.rough.Repo;

import java.util.Scanner;

public class AnsGen {

    public static void main(String[] args) {
        /*
        * we will have to get the user input
        * make a condition to match the user input
        * print the statments
        *
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single word: ");
        String userIn = scanner.next();

        while (true) {
            if (userIn.equalsIgnoreCase("abstraction")) {
                System.out.println(Repo.abstraction);
                System.out.println("Enter single word: ");
                userIn = scanner.next();
            } else if (userIn.equalsIgnoreCase("divide")) {
                System.out.println(Repo.stringDivide);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("reversestring")) {
                System.out.println(Repo.reverseString);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("removespecialchar")) {
                System.out.println(Repo.removeSpecialChar);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("bufferandstring")) {
                System.out.println(Repo.stringBufferAndString);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("bufferandbuilder")) {
                System.out.println(Repo.bufferAndBuilder);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("duplicatechar")) {
                System.out.println(Repo.duplicateChar);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("palindrome")) {
                System.out.println(Repo.palindrome);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("mavenlifecycle")) {
                System.out.println(Repo.mavenLifeCycle);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("pox.xml")) {
                System.out.println(Repo.pomxml);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase(".m2folder")) {
                System.out.println(Repo.m2folder);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("feature")) {
                System.out.println(Repo.featureFile);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else if (userIn.contains("maxnumber")) {
                System.out.println(Repo.maxnum);
                System.out.println("Enter single word: ");
                userIn = scanner.next();

            } else {
                System.out.println("Invalid input!!!");
                System.out.println("Enter single word: ");
                userIn = scanner.next();
            }


        }


    }



}
