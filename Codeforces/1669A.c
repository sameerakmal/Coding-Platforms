#include<stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++) {                 
        scanf("%d",&a[i]);
           }
        for(int i=0;i<n;i++) {

         if(a[i]<=1399) {
            printf("Division 4\n");
        }
       if(a[i]>=1400&&a[i]<=1599) {
            printf("Division 3\n");
        }
        if(a[i]>=1600&&a[i]<=1899) {
            printf("Division 2\n");
        }
        if(a[i]>=1900) {
            printf("Division 1\n");
        }
        }
    
    }

