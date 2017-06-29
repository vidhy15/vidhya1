import java.io.*;
import java.util.*;
import java.lang.*;
class Stringrev1
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        char []ch={'a','e','i','o','u'};
        System.out.println(sb);
        for(int i=0;i<sb.length();i++)
        {
            for(int j=0;j<ch.length;j++)
            {
            if(sb.charAt(i)==ch[j])
            {
                sb.deleteCharAt(i);
            }
            }
        }
        System.out.println(sb);
    }
}
