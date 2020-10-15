#include<stdio.h>
int place(int x[],int k)
{
int i;
for(i=0;i<k;i++)
if(x[i]==x[k] || abs(x[i]-x[k]) == abs(i-k))
return 0;
return 1;
}
void display(int x[],int n)
{
char chess[20][20];
int i,j;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
chess[i][j]=’X’;
for(i=0;i<n;i++)
chess[i][x[i]]=’q’;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf(“%c “,chess[i][j]);
}
printf(“\n”);
}
printf(“\n”);
}
void nqueen(int n)
{
int x[20];
int k;
x[0]=-1;
k=0;
while(k>=0)
{
x[k]+=1;
while(x[k]<n && !place(x,k))
x[k]+=1;
if(x[k]<n)
if(k==n-1)
display(x,n);
else
{
k++;
x[k]=-1;
}
else
k–;
}
}
int main()
{
int n;
printf(“Enter the no, of QUEENS :”);
scanf(“%d”,&n);
printf(“\nThe solution for %d queens problem is \n”,n);
nqueen(n);
}

