//
// Created by HanDaWoon on 2018-10-24.
//

#include <stdio.h>

int main()
{
    int N;

    scanf("%d", &N);

    for (int i = 0; i < N; ++i)
    {
        for (int k = i; k < N - 1; ++k)
        {
            printf(" ");
        }
        for (int j = 0; j <= i; ++j)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}