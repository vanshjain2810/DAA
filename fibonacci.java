import java.util.*;
import java.io.*;
class fibonacci
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ab.readLine());
        int a=0,b=1,c=1;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
	if(n==0)
	System.out.println("0");
	else
        System.out.println(c);
    }
}