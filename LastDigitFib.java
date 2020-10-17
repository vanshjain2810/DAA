import java.util.*;
import java.io.*;
class LastDigitFib
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(ab.readLine());
        n=n%60;
        int a=0,b=1,c=1,s=0;
        for(int x=2;x<=n;x++)
        {
            c=(a+b)%10;
            a=b%10;
            b=c%10;
	    s=(s+c)%10;
        }
        if(n==0)
        System.out.println(0);
        else
        System.out.println((s+1)%10);
    }
}