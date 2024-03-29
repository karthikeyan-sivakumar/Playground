#include <stdio.h>
#include <math.h>
/* This function converts the decimal number "decimalnum"
 * to the equivalent octal number
 */
int decimalToOctal(int decimalnum)
{
    int octalnum = 0, temp = 1;

    while (decimalnum != 0)
    {
    	octalnum = octalnum + (decimalnum % 8) * temp;
    	decimalnum = decimalnum / 8;
        temp = temp * 10;
    }

    return octalnum;
}
int main()
{
    int decimalnum;

    
    scanf("%d", &decimalnum);

    printf("%d", decimalToOctal(decimalnum));

    return 0;
}