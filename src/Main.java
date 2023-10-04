/*
*   Name: Samson Poon
*   Section: 12
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed Samson  Date 4th October
* */

public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int score) {
        if (score >= 96) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 75) {
            return 'C';
        } else if (score >= 65) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int i) {
        if (i%7==0 && i%2==0){
            return "fizzbuzz";
        }
        else if (i%7==0){
            return "buzz";
        }
        else if (i%2==0){
            return "fizz";
        } else {
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String backFront(String str){
        if (str.length() < 2){
            return str;
        }
        String back = str.substring(str.length() - 2);
        return back + str + back;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a*b==c || b*c==a || a*c==b){
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endDown(String str) {
        if (str.length() >= 3) {
            String finish = str.substring(str.length() - 3).toLowerCase();
            return str.substring(0, str.length() - 3) + finish;
        } else {
            return str.toLowerCase();
        }
    }
}
