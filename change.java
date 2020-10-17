import java.io.*;
import java.util.*;
class change
{
    public static void main(String []ar)throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ab.readLine());
        int a=0,b=0,c=0,s=0;
        a=(int)(n/10);
        n=n%10;
        b=(int)(n/5);
        n=n%5;
        c=n;
        s=a+b+c;
        System.out.println(s);
    }
}