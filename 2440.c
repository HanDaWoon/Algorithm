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
        for (int j = i; j < N; ++j)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}