import java.io.*;
import java.util.*;
class fractional_knapsack
{
    public static void main(String []ar)throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        float t,s=0.0f;
        int pq=0;
        String s1[]=ab.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        float W=Float.parseFloat(s1[1]);
        float v[]=new float[n];
        float w[]=new float[n];
        float p[]=new float[n];
        for(int x=0;x<n;x++)
        {
            String s2[]=ab.readLine().split(" ");
            v[x]=Float.parseFloat(s2[0]);
            w[x]=Float.parseFloat(s2[1]);
            p[x]=v[x]/w[x];
        }
        for(int x=0;x<n;x++)
            for(int y=x+1;y<n;y++)
                if(p[x]<p[y])
                {
                    t=p[x];
                    p[x]=p[y];
                    p[y]=t;
                    t=v[x];
                    v[x]=v[y];
                    v[y]=t;
                    t=w[x];
                    w[x]=w[y];
                    w[y]=t;
                }
        while(W>=0)
        {
            if(W-w[pq]>0)
            {
                s=s+v[pq];
                W=(float)(W-w[pq]);
                pq++;
            }
            else
            {
                s=s+(v[pq]/w[pq])*W;
                W=0;
                pq++;
            }
            if(pq==n)
            break;
        }
        System.out.printf("%.4f",s);
    }
}