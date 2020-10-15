#include<stdio.h>
#include<time.h>
#include<sys/times.h>
#include<stdlib.h>
#include<unistd.h>
#include<omp.h>
int part(int a[],int low,int high)
{
int i=low+1,p=low,j=high,temp;
while(i<=j)
{
while(a[i]<a[p])
i++;
while(a[j]>a[p])
j- -;
if(i<j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
else{
temp=a[j];
a[j]=a[p];
a[p]=temp;
return j;
}
}
}
void quick(int a[],int low,int high)
{
int j;
if(low<high)
{
j=part(a,low,high);
sleep(1);
quick(a,low,j-1);
quick(a,j+1,high);
}
}
int main()
{
int i,n,a[20];
struct tms t1,t2;
clock_t start,end;
double clktck=sysconf(_SC_CLK_TCK);
printf(“Enter the no .of elemets:”);
scanf(“%d”,&n);
printf(“\nThe elements selected are:\n”);
for(i=0;i<n;i++)
{
a[i]=random()%200;
printf(“%d “,a[i]);
}
start=times(&t1);
quick(a,0,n-1);
end=times(&t2);
printf(“\nThe sorted array is:\n”);
for(i=0;i<n;i++)
printf(“%d “,a[i]);
printf(“\nthe total time is:%f\n”,(end-start)/clktck);
}
