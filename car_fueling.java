import java.io.*;
import java.util.*;
class car_fueling
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int d=Integer.parseInt(ab.readLine());
        int m=Integer.parseInt(ab.readLine());
        int n=Integer.parseInt(ab.readLine());
        String s[]=ab.readLine().split(" ");
        List<Integer> a=new ArrayList<Integer>(n);
        a.add(0);
        int c=0,nr=0,l=0,p=0,count=0;
        l=m;
        for(int x=0;x<n;x++)
        a.add(Integer.parseInt(s[x]));
        a.add(d);
        while(l<d)
        {
            try
            {
                while(a.get(c)<=l)
                {
                    c++;
                }
            }
            catch(Exception e){}
            c=c-1;
            p=a.get(c);
            l=p+m;
            count++;
            if(count>n)
            {
                count=-1;
                break;
            }
        }
        System.out.println(count);
    }
}