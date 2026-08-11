/*Array Task*/
import java.io.*;
import java.util.*;

class ArrayTask
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];

        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }

            if(a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}