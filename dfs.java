import java.io.*;
import java.util.*;
class dfs
{
    public static void main(String ar[])throws Exception
    {
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int v=Integer.parseInt(ab.readLine());
        ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>(v);
        HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
        int x,y;
        for(x=0;x<v;x++)
        {
            graph.add(new ArrayList<Integer>());
            hm.put(x,false);
        }
        int e=Integer.parseInt(ab.readLine());
        for(x=0;x<e;x++)
        {
            String s[]=ab.readLine().split(" ");
            graph.get(Integer.parseInt(s[0])).add(Integer.parseInt(s[1]));
            graph.get(Integer.parseInt(s[1])).add(Integer.parseInt(s[0]));
        }
        Stack st=new Stack();
        for(x=0;x<v;x++)
        {
            if(hm.get(x)==false)
            {
                st.push(x);
                hm.put(x,true);
                while(!st.empty())
                {
                    int q=(Integer)st.pop();
                    System.out.println(q);
                    Iterator itr=graph.get(q).iterator();
                    while(itr.hasNext())
                    {
                        int an=(Integer)itr.next();
                        if(hm.get(an)==false)
                        {
                            st.push(an);
                            hm.put(an,true);
                        }
                    }
                }
            }
        }
    }
}