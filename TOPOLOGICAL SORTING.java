#include<stdio.h>
int main()
{
int i,n,j,count=0,k,a[10][10],indeg[10],flag[10];
printf(“Enter the no of elements:”);
scanf(“%d”,&n);
for(i=1;i<=n;i++)
{
indeg[i]=0;
flag[i]=0;
}
printf(“\nEnter the adjacency matrix\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&a[i][j]);
for(j=1;i<=n;j++)
for(i=1;i<=n;i++)
indeg[j]+=a[i][j];
printf(“\nthe topological sorting is\n”);
while(count<n){
for(k=1;k<=n;k++)
{
if((indeg[k]==0) && (flag[k]==0))
{
printf(“%d\t”,k);
flag[k]=1;
for(i=1;i<=n;i++)
{
if(a[k][i]==1)
indeg[i] – – ;
}
}
}
count++;
}
}