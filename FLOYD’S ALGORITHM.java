#include<stdio.h>
#include<omp.h>
#include<time.h>
#include<stdlib.h>
#include<sys/times.h>
#include<unistd.h>
int main()
{
struct tms t1,t2;
clock_t start,end;
double clktck=sysconf(_SC_CLK_TCK);
int i,j,k,a[10][10],n;
printf(“Enter the no .of vertices:”);
scanf(“%d”,&n);
printf(“\nEnter the adjacency matrix:\n”);
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf(“%d”,&a[i][j]);
start=times(&t1);
sleep(1);
#pragma omp for
for(k=1;k<=n;k++)
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
if(a[i][k]+a[k][j]<a[i][j])
a[i][j]=a[i][k]+a[k][j];
end=times(&t2);
printf(“\nThe ASAP is:\n”);
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
printf(“%d\t”,a[i][j]);
}
printf(“\n”);
}
printf(“The total time is: %f”,(end-start)/clktck);
}
