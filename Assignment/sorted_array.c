#include<stdio.h>
int main()
{
    int n,i,j,temp;
    printf("Enter number of elements");
    scanf("%d",&n);
    int a[n];
    printf("Enter elements in array");
    for(i=0;i<n;i++)
    {
    scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
    for(j=i+1;j<n;j++)
    {
    if(a[i]>a[j])
    {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }
    }
    }
    for(i=0;i<n;i++)
    {
    printf("Sorted elements in array are %d\n",a[i]);
    }
}