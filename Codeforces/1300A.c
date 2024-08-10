#include<stdio.h>
int main() {
 int n,val;
    scanf("%d",&n);
    int ishard=0;
    for(int i=1;i<=n;i++) {
        scanf("%d",&val);
        if(val==1) {
            ishard=1;
            break;
        } 
    }
        if(ishard) {
            printf("HARD");
        }
        else{
            printf("EASY");
        }
    
}