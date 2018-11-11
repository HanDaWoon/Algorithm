//
// Created by HanDaWoon on 2018-11-12.
//

#include <stdio.h>

int main()
{
    int N;

    scanf("%d", &N);

    for (int i = 0; i < N; ++i)
    {
        for (int j = 0; j < i; ++j)
        {
            printf(" ");
        }
        for (int k = N; k > i; --k)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}