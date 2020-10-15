#include<stdio.h>
#define max 10
int d;
int s[max], x[max];
void sumofset(int,int,int);
int main()
{
int n,i,sum=0;
printf(“Enter the size of set:\n”);
scanf(“%d”,&n);
printf(“\nEnter the set in increasing order:\n”);
for(i=1;i<=n;i++)
scanf(“%d”,&s[i]);
printf(“\nEnter the value of D:”);
scanf(“%d”,&d);
for(i=1;i<=n;i++)
sum+=s[i];
if(sum<d || s[1]>d)
printf(“\nNo subset possible\n”);
else
sumofset(0,1,sum);
}
void sumofset(int m,int k,int r)
{
int i;
x[k]=1;
if((m+s[k])==d)
{
for(i=1;i<=k;i++)
{
if(x[i]==1)
printf(“%d\t”,s[i]);
}
printf(“\n”);
}
else if(m+s[k]+s[k+1]<=d)
sumofset(m+s[k],k+1,r-s[k]);
if((m+r-s[k]>=d) && (m+s[k+1]<=d))
{
x[k]=0;
sumofset(m,k+1,r-s[k]);
}
}