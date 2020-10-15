#include<stdio.h>
#include<omp.h>
#include<time.h>
#include<sys/times.h>
#include<unistd.h>
#include<stdlib.h>
int a[20],b[20];
void merge(int a[],int low,int high);
void mera(int a[],int low,int mid,int high);
int main()
{
int i,n;
struct tms t1,t2;
clock_t start,end;
double clktck=sysconf(_SC_CLK_TCK);
printf(“Enter the no of elements:”);
scanf(“%d”,&n);
printf(“\nThe elements selected are:\n”);
for(i=0;i<n;i++)
{
a[i]=random()%100;
printf(“%d “,a[i]);
}
int low=0;
int high=n-1;
start=times(&t1);
sleep(1);
merge(a,low,high);
end=times(&t2);
printf(“\nThe sorted array is:\n”);
for(i=0;i<n;i++)
printf(“%d “,a[i]);
printf(“\n\nTotal time is: %f\n”,(end-start)/clktck);
}
void merge(int a[],int low,int high)
{
if(low<high)
{
int mid=(low+high)/2;
#pragma omp parallel
{
#pragma omp parallel sections
{
#pragma omp parallel section
{
merge(a,low,mid);
merge(a,mid+1,high);
mera(a,low,mid,high);
}
}
}
}
}
void mera(int a[],int low,int mid,int high)
{
int i,j,k;
i=k=low;
j=mid+1;
while(i<=mid && j<=high)
{
if(a[i]<a[j])
{
b[k]=a[i];
i++;
}
else{
b[k]=a[j];
j++;
}
k++;
}
while(i<=mid)
b[k++]=a[i++];
while(j<=high)
b[k++]=a[j++];
for(i=low;i<=high;i++)
a[i]=b[i];
}

