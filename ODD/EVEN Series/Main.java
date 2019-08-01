#include<stdio.h>
int main()
{
  int n,a,d,t_s1,t_s2,n_t;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t_s1=(n+1)/2;
    n_t=a+(t_s1-1)*d;
    printf("%d",n_t);
  }
  else
  {
    a=0,d=1;
    t_s2=n/2;
    n_t=a+(t_s2-1)*d;
    printf("%d",n_t);
  }
	//type your code here
return 0;	
}