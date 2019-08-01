#include<stdio.h>
int main()
{
  float r,an,ar;
  scanf("%f%f",&r,&an);
  ar=2*3.14*r*(an/360);
  printf("%.2f",ar);
  return 0;
}