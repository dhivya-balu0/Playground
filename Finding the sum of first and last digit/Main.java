#include <stdio.h>
int main() {
  int n,first,last,res;
  scanf("%d", &n);

    first = n;

    /* Remove last digit from number till only one digit is left */
    while(first >= 10)
    {
        first = first / 10;
    }
last = n % 10;
    
    res=first+last;

    printf("%d", res);


	//Type your code
	return 0;
}