#include<stdio.h>
int main()
{
int i,j,k,a[10][10],n;
printf(“Enter the no of vertices:”);
scanf(“%d”,&n);
printf(“\nEnter the adjacency matrix:\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&a[i][j]);
printf(“\nThe transitive closure is:\n”);
for(k=1;k<=n;k++)
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
if(a[i][k]==1&&a[k][j]==1)
a[i][j]=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
printf(“%d\t”,a[i][j]);
}
printf(“\n”);
}
}
