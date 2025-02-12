import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//                If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//                If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number.


//        for (int i = 1; i <=100 ; i++) { a loop that start from 1 to 100
//            if(i % 3 == 0 && i % 5 == 0){ //we start with is condition if the number is multiple of 3 and multiple of 5 because it countain  both
//                System.out.println("FizzBuzz "+i);
//            }else if(i % 3 == 0){// only one condition
//                System.out.println("Fizz "+ i);
//            }else if (i % 5 == 0){// only one condition
//                System.out.println("Buzz "+i);
//            }
//        }


//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT

        String words = "the quick brown fox ";
        String saving = "";
        char ch ;
        for (int i = 0; i < words.length(); i++) {
            ch = words.charAt(i);
            saving = ch + saving; // saving each character in i position
        }
        System.out.println(saving);


//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.


//        int number = 5; // a number
//        int mult=1; // number to multiplie with
//        for (int i = 1; i <= number; i++) { // start from 1 and stop when  i ==5
//            mult = mult * i; // multi = 1*1 ->  1*2 -> 2*3-> 6*4 -> 24*5 -->> 120
//        }
//        System.out.println("The factorial is = "+mult);


//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)


//         int num1 = 2; // initial number 1
//         int num2 = 3;// initial number 2
//         int power = 1; // initial number for power is 1 not 0 because we want to multiply it
//        for (int i =0 ; i < num2; i++) { // start for loop from 0 to num2 because it is the counter here
//           power = power * num1;  // the number that repeat here is number 1
//        }
//        System.out.println("The value of "+num1+"^"+num2+" = "+power);

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.


//        int sum_odd = 0;
//        int sum_even = 0;
//        for (int i = 1; i <=100; i++) {
//            if (i % 2 == 0){ // if any number when we % 2 = 0 thats mean it is even
//                sum_even+=i;// each number that seems it is even will add to the previous number
//            }else// not even mean it is odd
//                sum_odd+=i;
//        }
//        System.out.println("The sum of even number : "+sum_even);
//        System.out.println("The sum of odd number :"+sum_odd);


//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.


//        boolean flag = false;
//     System.out.println("Please enter a number to check if it is prime or not");
//        int num_prime = input.nextInt();
//        if (num_prime == 0 || num_prime == 1) {// 0 and 1 not a prime number ,so i checked to exit from the begged
//            flag = true;
//        }
//        for (int i = 2; i <= num_prime/2; i++) {//  any number / 2  we should check the half of it
//
//            if (num_prime % i == 0) { // if true that means it has another divise than 1 and same number so not prime
//                flag = true;
//                break;
//            }
//        }
//
//        if (!flag)
//            System.out.println(num_prime + " is a prime number.");
//        else
//            System.out.println(num_prime + " is not a prime number.");
//
//}


//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//        Day2
//        Day3
//        Day4
//        Day5
//        Day6
//        Day7
//        Week 2
//        Day1
//        Day2
//...


//        for (int i = 1; i <= 4; i++) {// for loop to print each week
//            System.out.println("Week "+i);// print the week number
//            for (int j = 1; j <=7; j++) {// for loop to print the days inside the each week
//                System.out.println("Day "+j);
//            }
//        }


//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.


//        String word = "etiitte";
//        boolean palin = true;
//        int helper = word.length()-1 ; // helper take the length of the word and -1 because any index start with 0
//        for (int i = 0; i < word.length(); i++) { // start from 0 and stop in any word length
//                  if (word.charAt(i) != word.charAt(helper)){ // here we say if char that at index "i" ex 0 and not equal to the helper which is the end of th word "7" exite
//                      palin = false;// if false change the palin to false
//                      break;// exit the loop
//                  }else // if true helper -1 and repeat step one
//                      helper--;
//
//                   }
//                 if (palin){ // if true print is palindrome
//                  System.out.println("The word "+word+" is palindrome.");
//                 }else // if false print not palindrome
//                 System.out.println("The word "+word+" is not palindrome.");
    }

}