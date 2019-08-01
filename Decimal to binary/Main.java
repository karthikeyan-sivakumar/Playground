#include <stdio.h>

int main()
{
    int number, n, remainder, binary = 0, place = 1;

    scanf("%d", &number);

    n = number;

    while (n > 0)
    {
        remainder = n % 2;
        binary += remainder * place;
        place *= 10;
        n /= 2;
    }
    
    printf("%d",binary);

    return 0;
}