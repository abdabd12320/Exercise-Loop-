import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        //Ex1
        for(int i = 1;i <= 100;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if (i%3==0)
                System.out.println("Fizz");
            else if (i%5==0)
                System.out.println("Buzz");

            else System.out.println(i);
        }
        System.out.println("---------------------------------------");

        //Ex2
        System.out.print("Enter your String: ");
        String sentence = in.nextLine();
        String r = "";
        for(int i=sentence.length()-1;i>=0;i--)
        {
            r += sentence.charAt(i);
        }
        System.out.println("Reversed string : " + r);
        System.out.println("--------------------------");

        //Ex3
        System.out.print("Enter number: ");

        int x = in.nextInt();
        int factorial = 1;
        for(int i=x;i>0;i--)
        {
            factorial *= i;
        }
        System.out.println("The factorial (" + x + ") is: " + factorial);

        System.out.println("---------------------------------------");

        //Ex4
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();

        for (int i = 1; i < num2; i++) {
            num1 *= num1;
        }
        System.out.println(num1);
        System.out.println("---------------------------------------");
        //Ex5

        int num,count,even = 0,odd = 0;
        do {
            System.out.print("Please enter count(you must to enter number biggest than 0): ");
            count = in.nextInt();
        }while (count <= 0);
        for(int i=1;i<=count;i++) {
            System.out.print("Enter number: ");
            num = in.nextInt();
            if(num % 2 == 0)
                even+= num;
            else odd+= num;
        }
        System.out.println("sum of odd = " + odd);
        System.out.println("sum of even = " + even);
        System.out.println("---------------------------------------");

        //Ex6
        int p_num = 0;
        do {
            System.out.print("please Enter a number bigger than 2: ");
            p_num = in.nextInt();
        }while(p_num < 2);
        int ii = p_num,counter = 0;
        while(ii > 2)
        {
            if(p_num % ii == 0)
            {
                counter++;
            }
            ii--;
        }
        if(counter == 1)
            System.out.println("is prime");
        else
            System.out.println("is not prime");
        System.out.println("---------------------------------------");

        //Ex7
        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1;j <= 7;j++)
            {
                System.out.println("Day" + j);
            }
        }
        System.out.println("---------------------------------------");

        //Ex8
        System.out.print("Enter Palindrome word: ");
        in.nextLine();
        String p_word_l_r = in.nextLine();
        String p_word_r_l = "";

        for(int i = p_word_l_r.length()-1; i >= 0; i--) {
            p_word_r_l += p_word_l_r.charAt(i);
        }
        if(p_word_l_r.equalsIgnoreCase(p_word_r_l))
            System.out.println("The word is a Palindrome");
        else System.out.println("The word is not a Palindrome");

        in.close();
    }
}