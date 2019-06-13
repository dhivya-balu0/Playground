#include<stdio.h>
int main()
{
  int n,first,last,result;
  scanf("%d",&n);
  first=n/100;
  last=n%10;
  result=first+last;
  printf("%d",result);
  //Type your code here
  return 0;
}