import java.io.*;
import java.util.*;
class Stringrev
{
    public static void main(String [] a)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
       StringBuffer sb=new StringBuffer(str);
       sb.reverse();
       System.out.println(sb);
        
    }  
}
