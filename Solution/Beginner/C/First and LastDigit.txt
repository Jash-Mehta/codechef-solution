#include <stdio.h>

int main(void){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,l,f,sum;
        scanf("%d",&n);
        l=n%10;
        f=n;
        while(f>=10){
            f=f/10;
        }
        sum = f+l;
        printf("%d\n",sum);
    }
    return 0;
}

