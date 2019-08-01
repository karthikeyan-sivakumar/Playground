#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,t1,t2,nt;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1,r=2;
    t1=(n+1)/2;
    nt=a*pow(r,t1-1);
    printf("%d",nt);
  }
  else
  {
    a=1,r=3;
    t2=n/2;
    nt=a*pow(r,t2-1);
    printf("%d",nt);
  }
  return 0;
}