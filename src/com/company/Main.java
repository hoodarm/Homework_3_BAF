package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int A = 237;
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
    }
}
