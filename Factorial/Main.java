#include<stdio.h>
int main()
{
  int i,n;
  unsigned long int factorial=1;
  scanf("%d",&n);
  if(n<0)
  {
    printf("Not Valid");
  }
  else
  {
    for(i=1;i<=n;i++)
    {
      factorial=factorial*i;
    }
  }
    printf("%llu",factorial);
    return 0;
	//your code here
}