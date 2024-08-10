#include <stdio.h>

void checkLucky(int ticket[]) {
    int sum_first_three = ticket[0] + ticket[1] + ticket[2];
    int sum_last_three = ticket[3] + ticket[4] + ticket[5];

    if (sum_first_three == sum_last_three) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
}

int main() {
    int n;
    scanf("%d", &n);

    int tickets[n][6];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 6; j++) {
            scanf("%1d", &tickets[i][j]);
        }
    }

    for (int i = 0; i < n; i++) {
        checkLucky(tickets[i]);
    }

    return 0;
}