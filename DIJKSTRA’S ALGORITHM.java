#include<stdio.h>
int main()
{
int w,n,i,j,u,v,a,b,cost[10][10],s[15],dist[15],min,num;
printf(“Enter the no of vertices:”);
scanf(“%d”,&n);
printf(“\nEnter the cost matrix\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&cost[i][j]);
printf(“\nEnter the source vertex:”);
scanf(“%d”,&v);
for(i=1;i<=n;i++)
{
s[i]=0;
dist[i]=cost[v][i];
}
s[v]=1;
for(num=2;num<=n;num++)
{
min=999;
for(w=1;w<=n;w++)
{
if(s[w]=0 && dist[w]<min)
{
min=dist[w];
u=w;
}
}
s[u]=1;
for(w=1;w<=n;w++)
{
if(s[w]==0)
{
if(dist[u]+cost[u][w]<dist[w])
dist[w]=dist[u]+cost[u][w];
}
}
}
printf(“\nSource to destination\n”);
for(i=1;i<=n;i++)
printf(“%d—->%d = %d\n”,v,i,dist[i]);
}