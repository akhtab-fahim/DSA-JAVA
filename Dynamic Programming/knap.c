#include<stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int main() {
    int i, j, n = 4, m = 8, K[5][9], X[4] = {0};
    int P[5] = {0, 1, 2, 5, 6};
    int W[5] = {0, 2, 3, 4, 5};

    for (i = 0; i <= n; i++) {
        for (j = 0; j <= m; j++) {
            if (i == 0 || j == 0)
                K[i][j] = 0;
            else if (W[i] <= j)
                K[i][j] = max(K[i - 1][j], K[i - 1][j - W[i]] + P[i]);
            else
                K[i][j] = K[i - 1][j];
        }
    }

    printf("\nThe maximum profit is = %d", K[n][m]);
    i = n, j = m;

    while (i > 0 && j > 0) {
        if (K[i][j] != K[i - 1][j]) {
            X[i - 1] = 1;
            j -= W[i];
        }
        i--;
    }

    printf("\nThe items taken into the knapsack as:\n\t");
    for (i = 0; i < n; i++)
        printf("\t%d", X[i]);

    return 0;
}
