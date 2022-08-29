package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Method 1

        int A = 236;
        int B = 354345;

        String string_A = Integer.toString(A);
        String string_B = Integer.toString(B);

        int length_A = string_A.length() - 1;
        int length_B = string_B.length() - 1;

        if (string_A.charAt(length_A) == string_B.charAt(length_B))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        //Method 2

        if (A%10==B%10)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);

        //Method 3

        if ((A-B)%10==0)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
