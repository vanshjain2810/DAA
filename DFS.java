#include<stdio.h>
#include<conio.h>
int v,n,i,j,a[10][10],visited[10];
void dfs(int v)
{
int w;
visited[v]=1;
for(w=1;w<=n;w++)
if(a[v][w] && visited[w]==0)
{
visited[w]=1;
dfs(w);
}
}
int main()
{
int flag=0;
printf(“Enter the no. of vertices:”);
scanf(“%d”,&n);
printf(“\nEnter the adjacency matrix:\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&a[i][j]);
printf(“\nEnter the source vertex:”);
scanf(“%d”,&v);
dfs(v);
for(i=1;i<=n;i++)
{
if(visited[i]==1)
flag=1;
else
{
flag=0;
break;
}
}
if(flag==1)
printf(“\ngraph is connected\n”);
else
printf(“\nnot connected\n”);
}
