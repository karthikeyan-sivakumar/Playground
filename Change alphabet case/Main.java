#include <stdio.h>
int main() {
  char al;
  scanf("%c",&al);
  if(al>='A' && al<='Z')
  {
    printf("%c",al+32);
  }
  else if(al>='a' && al<='z')
  {
    printf("%c",al-32);
    }
	// Type your code here
	return 0;
}