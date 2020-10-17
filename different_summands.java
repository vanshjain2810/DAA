import java.io.*;
import java.util.*;
class different_summands
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(ab.readLine());
        long c=1;
        int b=0,d=0,e=0;
        ArrayList<Long> a=new ArrayList<Long>();
        while(true)
        {
            if((n-c)<=c)
            {
                a.add(n);
                break;
            }
            a.add(c);
            n=n-c;
            c++;
        }
	System.out.println(a.size());
        for(int x=0;x<a.size();x++)
        System.out.print(a.get(x)+" ");
    }
}