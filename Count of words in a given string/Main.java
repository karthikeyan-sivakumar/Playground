#include<stdio.h>
#include<string.h>
int main()
{
  int i,count=0;
  char s[200];
  scanf("%[^\n]s", s);
  for(i=0;s[i]!='\0';i++)
  {if(s[i]==' ')
      count++;
  }
  printf("%d",count+1);
  return 0;
}
  