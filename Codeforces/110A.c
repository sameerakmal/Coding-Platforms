#include<stdio.h>
int main() {
    long long int n;
    int st,count=0;
    scanf("%lld",&n);
while(n>0){
    st=n%10;
    if(st==4||st==7) {
        count++;
    }
        n=n/10;
}
if(count==4||count==7) {
    printf("Yes");
}
else {
    printf("No");
}
}
    
