import java.io.*;
import java.util.*;
class dsu
{
    static BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int v,e;
    dsu(int v,int e)
    {
        this.v=v;
        this.e=e;
    }
    
    void makeset()
    {
        for(int x=1;x<=v;x++)
        hm.put(x,-1);
    }
    
    int parent(int n)
    {
        if(hm.get(n)==-1)
        return n;
        return(parent(hm.get(n)));
    }
    
    void union()throws Exception
    {
        int p;
        for(int x=0;x<e;x++)
        {
            String s[]=ab.readLine().split(" ");
            if(hm.get(Integer.parseInt(s[1]))!=-1)
            {
                p=parent(Integer.parseInt(s[1]));
                hm.put(p,Integer.parseInt(s[0]));
            }
            else
            hm.put(Integer.parseInt(s[1]),Integer.parseInt(s[0]));
        }
    }
    
    void print()
    {
        for(int x=1;x<=v;x++)
        System.out.println(x+" -> "+hm.get(x));
    }
    public static void main(String ar[])throws Exception
    {
        int v=Integer.parseInt(ab.readLine());
        int e=Integer.parseInt(ab.readLine());
        dsu obj=new dsu(v,e);
        obj.makeset();
        obj.union();
        obj.print();
    }
}