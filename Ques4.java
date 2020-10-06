/*
ritik
20194096
using this file for learning git
*/
import java.util.Scanner;

class paraNumToken
{
    static String[] splitPara(String s, int n)
    {
        int size;
        if(s.length() % n == 0)
            size = s.length() / n;
        else
            size = s.length() / n + 1;

        String[] a = new String[size];
        int i = 0, j = 0;
        while(j < size - 1 && i + n < s.length()) 
        {
            a[j] = s.substring(i, i + n);
            i = i + n;
            ++j;
        }
        a[j] = s.substring(i);
        return a;
    }

    static String[] remDuplic(String[] s) 
    {
        String[] temp = new String[s.length];
        String t = s[0];
        int count = 1;
        temp[0] = t;
        
        for(int i = 1; i < s.length; ++i)
        {
            if(s[i].compareTo(t) != 0) {
                temp[count] = s[i];
                count++;
                t = s[i];
            }
        }

        String[] res = new String[count];
        for(int i = 0; i < count; ++i)
            res[i] = temp[i];
        
        return res;
    }

    static String[] sortStr(String[] s)
    {
        for(int i = 0; i < s.length; ++i)
        {
            for(int j = i + 1; j < s.length; ++j)
            {
                String temp;
                if(s[i].compareTo(s[j]) > 0) 
                {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Paragraph with continuous alphabets : ");
        String s = sc.nextLine();
        System.out.printf("Enter the fixed size of the token : ");
        int n = sc.nextInt();

        String a[] = splitPara(s, n);
        a = sortStr(a);
        a = remDuplic(a);
        
        for(int i = 0; i < a.length; ++i)
            System.out.println(a[i]);   
    }
}
