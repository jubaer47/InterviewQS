package com.rough;

public class Repo {

    public static String abstraction = "An Abstraction is a process of exposing all the necessary details and hiding the rest.\n In Java, Data Abstraction is defined as the process of reducing \n the object to its essence so that only the necessary characteristics are exposed to the users.";
    public static String stringDivide = "The split() method splits a string into an array of substrings, and returns the new array.\n If an empty string (\"\") is used as the separator, \nthe string is split between each character";
    public static String reverseString = "public class ReverseWord {\n" +
            "\n" +
            "    public static void reverseWord(String sentence) {\n" +
            "        // String sentence = \"Hello world\";\n" +
            "        String words[] = sentence.split(\" \");\n" +
            "        StringBuffer stringBuffer = new StringBuffer();\n" +
            "\n" +
            "        for(String word : words){\n" +
            "            for (int i = word.length()-1; i >=0; i--) {\n" +
            "                stringBuffer.append(word.charAt(i));\n" +
            "            }\n" +
            "\n" +
            "            stringBuffer.append(\" \");\n" +
            "        }\n" +
            "\n" +
            "        System.out.println(stringBuffer.toString().trim());\n" +
            "\n" +
            "\n" +
            "        \n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        reverseWord(\"Hello world\");\n" +
            "    }\n" +
            "    \n" +
            "}\n";
    public static String removeSpecialChar = "Java replaceAll() method of String class replaces each substring of this string that matches the given regular expression with the replacement.\n" +
            "\n" +
            "public class RemoveSpecialCharacterExample1  \n" +
            "{  \n" +
            "public static void main(String args[])   \n" +
            "{  \n" +
            "String str= \"This#string%contains^special*characters&.\";   \n" +
            "str = str.replaceAll(\"[^a-zA-Z0-9]\", \" \");  \n" +
            "System.out.println(str);  \n" +
            "}  \n" +
            "}  \n";
    public static String stringBufferAndString = "The main difference between String and StringBuffer is String \nis immutable while StringBuffer is mutable means you can modify a StringBuffer \nobject once you created it without creating any new object.\n";
    public static String bufferAndBuilder = "The main difference between the StringBuffer \nand StringBuilder is that StringBuilder is also not thread safe. \nStringBuilder is fast as it is not thread safe . StringBuilder and StringBuffer are almost the same. \nThe difference is that StringBuffer is synchronized and StringBuilder is not.";
    public static String duplicateChar = "public class DuplicateCharacters {  \n" +
            "     public static void main(String[] args) {  \n" +
            "        String string1 = \"Great responsibility\";  \n" +
            "        int count;  \n" +
            "            //Converts given string into character array  \n" +
            "        char string[] = string1.toCharArray();  \n" +
            "          System.out.println(\"Duplicate characters in a given string: \");  \n" +
            "        //Counts each character present in the string  \n" +
            "        for(int i = 0; i <string.length; i++) {  \n" +
            "            count = 1;  \n" +
            "            for(int j = i+1; j <string.length; j++) {  \n" +
            "                if(string[i] == string[j] && string[i] != ' ') {  \n" +
            "                    count++;  \n" +
            "                    //Set string[j] to 0 to avoid printing visited character  \n" +
            "                    string[j] = '0';  \n" +
            "                }  \n" +
            "            }  \n" +
            "            //A character is considered as duplicate if count is greater than 1  \n" +
            "            if(count > 1 && string[i] != '0')  \n" +
            "                System.out.println(string[i]);  \n" +
            "        }  \n" +
            "    } \n";
    public static String palindrome = "public class Palindrome {\n" +
            "    \n" +
            "    public static void checkPalindrome(String word) {\n" +
            "        // String word = \"mom\";\n" +
            "        char charOne[] = word.toCharArray();\n" +
            "        int j = charOne.length-1;\n" +
            "\n" +
            "        if (charOne.equals(null)||charOne.length<2||charOne.equals(\" \")) {\n" +
            "            System.out.println(\"Input is not valid\");\n" +
            "        }\n" +
            "\n" +
            "\n" +
            "        for(int i = 0; i<=charOne.length; i++, j--){\n" +
            "            if (charOne[i] == charOne[j]) {\n" +
            "                System.out.println(\"Palindrome\");\n" +
            "                break;\n" +
            "            }else{\n" +
            "                System.out.println(\"Not Palindrome\");\n" +
            "                break;\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "\n" +
            "        \n" +
            "    }\n" +
            "\n" +
            "\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        checkPalindrome(\" \");\n" +
            "    }\n";
    public static String mavenLifeCycle = "Maven is based around the central concept of a build lifecycle. ... \nThere are three built-in build lifecycles: default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, \nwhile the site lifecycle handles the creation of your project's web site.\n";
    public static String pomxml = "POM is an acronym for Project Object Model. The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc.\n" +
            "Maven reads the pom.xml file, then executes the goal.\n" +
            "Before maven 2, it was named as project.xml file. But, since maven 2 (also in maven 3), it is renamed as pom.xml.\n";
    public static String m2folder = ". m2 folder is the default folder used by maven to store its: settings. xml file which specifies properties, \nlike the central repository to download your dependencies, the location of the so-called localRepository. \nby default, the localRepository in which maven stores all the dependencies your project might need to run ";
    public static String pom = "Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements.\n It is useful in reducing code duplication and improves test case maintenance.\n In Page Object Model, consider each web page of an application as a class file.\n";
    public static String featureFile = "n the Project tool window, right click the features folder and select New | File.\n" +
            "Name the new file. You can give it any name, but make sure to use the . feature extension (for example, BeerCans. feature ). ...\n" +
            "After that, you can add the code for the feature file and create your test scenario.\n";
    public static String cucumberOption = "Cucumber Options tag is used to provide a link between the feature files and step definition files. Each step of the feature file is mapped to a corresponding method on the step definition file.\n" +
            "\n" +
            "@CucumberOptions(features=\"Features\",glue={\"StepDefinition\"})\n";
    public static String scrarioAndDataable = "The Scenario Outline keyword can be used to run the same Scenario multiple times, with different combinations of values.\n" +
            " \n" +
            "This works only for the single step, below which it is defined\n" +
            "A separate code is need to understand the test data and then it can be run single or multiple times but again just for the single step, not for the complete test\n" +
            "Data tables are passed wholesale to the step definitions, and it’s up to the user to interpret them. They don’t necessarily have a header row\n";
    public static String maxnum = "public class MaxNumber {\n" +
            "\n" +
            "    public static void findMaxNumber(int numbers[]) {\n" +
            "        \n" +
            "        int maxNumber = numbers[0];\n" +
            "\n" +
            "        for (int i = 1; i < numbers.length; i++) {   /*  you can also find the minimum number by maxnumber>numbers[i] */\n" +
            "            if (maxNumber<numbers[i]) {\n" +
            "                maxNumber = numbers[i];\n" +
            "            }\n" +
            "            \n" +
            "        }\n" +
            "\n" +
            "        System.out.println(maxNumber +\" \"+\"This is the max number from this array\");\n" +
            "        \n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        \n" +
            "        int a[] = {1,3,5,7,8,9};\n" +
            "        findMaxNumber(a);\n" +
            "\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "    \n" +
            "}\n";
    public static String doWhileLoop = "The main difference between a while loop and do while loop is that while loop check condition before iteration of the loop.\n";
    public static String enhancedloopandforloop = "The enhanced for loop executes in sequence. i.e the counter is always increased by one, \n whereas in for loop you can change the step as per your wish e.g \n doing something like i=i+2; to loop every second element in an array or collection.\n";
    public static String swStatement = "Switch statement in C tests the value of a variable and compares it with multiple cases. \n Once the case match is found, a block of statements associated with that particular case is executed. \nEach case in a block of a switch has a different name/number which is referred to as an identifier.";
    public static String handleEx = "Let's start with the basics of exception handling in Java before we move to more advanced topics. \n The try-catch is the simplest method of handling exceptions. \n Put the code you want to run in the try block, and any Java exceptions that the code throws are caught by one or more catch blocks.\n";
    public static String  twrowAndClause= "Throws clause is used to declare an exception,\n  which means it works similar to the try-catch block. ... Throw keyword is used in the method body to throw an exception, \n while throws is used in method signature to declare the exceptions that can occur in the statements present in the method.\n";
    public static String tryCatch = "Try\n" +
            "We specify the block of code that might give rise to the exception in a special block with a “Try” keyword.\n" +
            "Catch\n" +
            "When the exception is raised it needs to be caught by the program. This is done using a “catch” keyword. So a catch block follows the try block that raises an exception. The keyword catch should always be used with a try.\n" +
            "Finally\n" +
            "Sometimes we have an important code in our program that needs to be executed irrespective of whether or not the exception is thrown. This code is placed in a special block starting with the “Finally” keyword. The Finally block follows the Try-catch block.\n" +
            "Throw\n" +
            "The keyword “throw” is used to throw the exception explicitly.\n" +
            "Throws\n" +
            "The keyword “Throws” does not throw an exception but is used to declare exceptions. This keyword is used to indicate that an exception might occur in the program or method.\n" +
            "\n" +
            "\n";
    public static String finallyFinalAndFinalize = "The basic difference between final, \nfinally and finalize is that the final is an access modifier, finally is the block in Exception Handling and finalize is the method of object class. ... \nfinalize is the method in Java which is used to perform clean up processing just before object is garbage collected.\n";
    public static String catchBlock = "Yes, we can define one try block with multiple catch blocks in Java.\n" +
            "Every try should and must be associated with at least one catch block.\n" +
            "Whenever an exception object is identified in a try block and if there are multiple catch blocks then \nthe priority for the catch block would be given based on the order in which catch blocks are have been defined.\n" +
            "Highest priority would be always given to first catch block. \nIf the first catch block cannot handle the identified exception object then it considers the immediate next catch block.\n" +
            "class TryWithMultipleCatch {\n" +
            "   public static void main(String args[]) {\n" +
            "      try{\n" +
            "         int a[]=new int[5];\n" +
            "         a[3]=10/0;\n" +
            "         System.out.println(\"First print statement in try block\");\n" +
            "      } catch(ArithmeticException e) {\n" +
            "         System.out.println(\"Warning: ArithmeticException\");\n" +
            "      } catch(ArrayIndexOutOfBoundsException e) {\n" +
            "         System.out.println(\"Warning: ArrayIndexOutOfBoundsException\");\n" +
            "      } catch(Exception e) {\n" +
            "         System.out.println(\"Warning: Some Other exception\");\n" +
            "      }\n" +
            "      System.out.println(\"Out of try-catch block\");\n" +
            "   }\n" +
            "}\n";
    public static String exit = "exit() method exits current program by terminating running Java virtual machine. \nThis method takes a status code. A non-zero value of status code is generally used to indicate abnormal termination.\n";
    public static String  cucumber = "Cucumber is the Framework you use in order to perform BDD.\n" +
            "using the help of cucumber we are able to write or add feature file into our project. cucumber is written in gherkin syntax. \n" +
            "gherkin is basically a programing language.\n";
    public static String addcucumber = "I need to have two jar files for that\n" +
            "1)cucumber with java\n" +
            "2)cucumber with JUnit\n" +
            "Although I’m using JUnit I can not import those annotations from JUnit. \nI have to import those JUnit annotations from the jar I added to my project “cucumber-JUnit.”\n";
    public static String howfeaturefilelookslike = "Feature: Check login process\n" +
            "  when I provide valid email and password\n" +
            "  as a customer, i should be logged into Facebook\n" +
            "  @login\n" +
            "  Scenario: login\n" +
            "  Given I open Facebook\n" +
            "  When I enter my email as \"abc@gmail.com\" And password as \"1234\"\n" +
            "  Then I should be able to log in";
    public static String basedonfeaturefile = "In order to write a feature file, we need to follow  BRD.\n";
    public static String scenariokey = "The scenario keyword is used in order to write any test scenarios. \nin simple words how you going to test your application, what steps, and what are strategies you would take.\n";
    /*public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";
    public static String  = "";*/




}
