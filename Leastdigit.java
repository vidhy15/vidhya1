package vidhya2;
import java.io.*;
import java.util.*;
import java.util.*;
public class Leastdigit {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String n=s.next();
	int n1=s.nextInt();
	int temp=0;
	int l=(n.length())-n1;
	char ch[]=n.toCharArray();

	int a[]=new int[n.length()];
	for(int i=0;i<n.length();i++)
	{
	a[i]=Character.getNumericValue(ch[i]);
	//System.out.println(a[i]);
	}
	Arrays.sort(a);
	for(int j=0;j<l;j++)
	{
		System.out.print(a[j]);
		
	}
	
}
}
