import java.io.*;
import java.util.*;
class Subset
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ab.readLine());
        String s[]=ab.readLine().split(" ");
        int a[]=new int[n];
        int x,y,sum=0;
        for(x=0;x<n;x++)
        {
            a[x]=Integer.parseInt(s[x]);
            sum=sum+a[x];
        }
        if(sum%2==1)
        System.out.println(false);
        else
        {
	    sum=sum/2;
            boolean dp[][]=new boolean[n+1][sum+1];
            for(x=0;x<=n;x++)
            dp[x][0]=true;
            for(x=1;x<=n;x++)
            {
                for(y=1;y<=sum;y++)
                {
                    if(a[x-1]>y)
                    dp[x][y]=dp[x-1][y];
                    else
                    {
                        dp[x][y]=dp[x-1][y]||dp[x-1][y-a[x-1]];
                    }
                }
            }
            for(x=0;x<=n;x++)
            {
                for(y=0;y<=sum;y++)
                {
                    System.out.print(dp[x][y]+"\t");
                }
                System.out.println();
            }
        }
    }
}