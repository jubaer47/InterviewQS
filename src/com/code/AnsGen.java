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
        System.out.println("ENTER INPUT: ");
        String userIn = scanner.next();

        while (true) {
            if (userIn.equalsIgnoreCase("abstraction")) {
                System.out.println(Repo.abstraction);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            } else if (userIn.equalsIgnoreCase("divide")) {
                System.out.println(Repo.stringDivide);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("reversestring")) {
                System.out.println(Repo.reverseString);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("removespecialchar")) {
                System.out.println(Repo.removeSpecialChar);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("bufferandstring")) {
                System.out.println(Repo.stringBufferAndString);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("bufferandbuilder")) {
                System.out.println(Repo.bufferAndBuilder);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("duplicatechar")) {
                System.out.println(Repo.duplicateChar);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.equalsIgnoreCase("palindrome")) {
                System.out.println(Repo.palindrome);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("mavenlifecycle")) {
                System.out.println(Repo.mavenLifeCycle);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("pox.xml")) {
                System.out.println(Repo.pomxml);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase(".m2folder")) {
                System.out.println(Repo.m2folder);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }else if (userIn.equalsIgnoreCase("feature")) {
                System.out.println(Repo.featureFile);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            } else if (userIn.contains("maxnumber")) {
                System.out.println(Repo.maxnum);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();

            }  else if (userIn.contains("dowhile")) {
                System.out.println(Repo.doWhileLoop);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            } else if (userIn.contains("forandenhanced")) {
                System.out.println(Repo.enhancedloopandforloop);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("switch")) {
                System.out.println(Repo.swStatement);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("handleexception")) {
                System.out.println(Repo.handleEx);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("throwandclause")) {
                System.out.println(Repo.twrowAndClause);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("trycatch")) {
                System.out.println(Repo.tryCatch);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("finalfinally")) {
                System.out.println(Repo.finallyFinalAndFinalize);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("multiplecatchblock")) {
                System.out.println(Repo.catchBlock);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("system.exit")) {
                System.out.println(Repo.exit);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("cucumber")) {
                System.out.println(Repo.cucumber);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            } else if (userIn.contains("addcucumber")) {
                System.out.println(Repo.addcucumber);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("featurefilelooklike")) {
                System.out.println(Repo.howfeaturefilelookslike);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("basedonfeaturefilelooklike")) {
                System.out.println(Repo.basedonfeaturefile);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }else if (userIn.contains("scenariokey")) {
                System.out.println(Repo.scenariokey);
                System.out.println("ENTER INPUT: ");
                userIn = scanner.next();
            }
            else {
                System.out.println("Invalid input!!!");
                System.out.println("ENTER INPUT AGAIN: ");
                userIn = scanner.next();
            }


        }


    }



}
