#include<stdio.h>
int main() {
    int t;
    scanf("%d",&t);
    int arr[t][3];
    for(int i=0;i<t;i++) {
    for(int j=0;j<3;j++) {
        scanf("%d",&arr[i][j]);
     } 
} 
    for(int i=0;i<t;i++) {
    if(arr[i][0]+arr[i][1]==arr[i][2] || arr[i][1]+arr[i][2]==arr[i][0] || arr[i][2]+arr[i][0]==arr[i][1]){
        printf("Yes\n");
    }
    else printf("No\n");
} }