#include<stdio.h>
void bfs(int a[20][20],int n,int start,int s[])
{
int i,v,f,r,q[20],u;
f=r=0;
for(i=1;i<=n;i++)
s[i]=0;
q[r]=start;
s[start]=1;
while(f<=r){
u=q[f++];
for(v=1;v<=n;v++)
if(a[u][v]==1 && s[v]==0)
{
s[v]=1;
q[++r]=v;
}
}
}
int main()
{
int n,start,a[20][20],s[20],i,j;
printf(“Enter the no of vertices:”);
scanf(“%d”,&n);
printf(“\nEnter the adjacency matrix\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&a[i][j]);
printf(“\nEnter the start vertex:”);
scanf(“%d”,&start);
bfs(a,n,start,s);
for(i=2;i<=n;i++)
{
if(s[i]==1)
printf(“\nvertex %d is reachable\n”,i);
else
printf(“\nvertex %d is not reachable\n”,i);
}
}