import java.io.*;
import java.util.*;

class ArrayQ3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 two-digit numbers:");

        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }

        //  Subtraction of digits
        System.out.println("\nSubtraction of Digits:");

        for(int i=0;i<5;i++)
        {
            int num = a[i];

            int first = num / 10;
            int second = num % 10;

            int sub = first - second;

            if(first > second)
            {
                sub = first - second;
            }
            else
            {
                sub = second - first;
            }
            System.out.print(sub + " ");
        }

        //  Addition of digits
        System.out.println("\nAddition of Digits:");

        for(int i=0;i<5;i++)
        {
            int num = a[i];

            int first = num / 10;
            int second = num % 10;

            int add = first + second;

            System.out.print(add + " ");
        }

        //  Even Index Values
        System.out.println("\nEven Index Values`:");

        for(int i=0;i<5;i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}