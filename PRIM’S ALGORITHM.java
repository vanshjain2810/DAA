#include<stdio.h>
int main()
{
int i,min,mincost=0,j,a,b,u,v,cost[10][10],visited[10]={0},n,ne=1;
printf(“Enter the no of vertices:”);
scanf(“%d”,&n);
printf(“Enter the cost of the matrix:\n”);
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
scanf(“%d”,&cost[i][j]);
if(cost[i][j]==0)
cost[i][j]=999;
}
}
printf(“\nThe edge of the spanning tree are:\n”);
visited[1]=1;
while(ne<n)
{
min=999;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(cost[i][j]<min)
{
if(visited[i]==0)
continue;
else{
min=cost[i][j];
a=u=i;
b=v=j;
}
}
}
}
if(visited[u]==0||visited[v]==0)
{
printf(“%d\tedge(%d,%d)= %d\n”,ne++,a,b,min);
mincost+=min;
visited[b]=1;
}
cost[a][b]=cost[b][a]=999;
}
printf(“\nThe min cost is:%d\n”,mincost);
}
