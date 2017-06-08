import java.io.*;
import java.util.*;
public class Student{  
int a;
Student()
{
this(20);;
a=0;
}
Student(int a)
{
this.a=a;
}
void print()
{
System.out.println(a);
}
}
class Main
{
public static void main(String[] args)
{
Student t1 = new Student();
Student t2 = new Student(10);
t1.print();
t2.print();
}
}
