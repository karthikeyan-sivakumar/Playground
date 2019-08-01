#include <stdio.h>
int main() {
	int n,rem;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    n/=10;
  if(n<=9)
  {
    printf("%d",rem);
    break;
  }
  }
	return 0;
}