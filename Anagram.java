import java.io.*;
import java.util.*;
class Anagram
{
   static void Anagram1(String s1,String s2)
    {
        String c1=s1.replaceAll("\\s","");
        String c2=s2.replaceAll("\\s","");
        boolean s=false;
        char ch1[]=c1.toCharArray();
        char ch2[]=c2.toCharArray();
        if(ch1.length != ch2.length)
        {
        s=false;
        }
        else
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            s=Arrays.equals(ch1,ch2);
        }
        if(s==true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("No anagram words");
        }
    }
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          String str1=sc.nextLine();
          String str2=sc.nextLine();
          Anagram1(str1,str2);
        }
}
