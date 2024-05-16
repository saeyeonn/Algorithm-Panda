// BOJ 11050 이항 계수 1

#include <stdio.h>
 
int main(){
    int n = 0, r = 0;
    scanf("%d %d", &n, &r);
 
    int s1 = n, s2 = r, s3 = n-r;
 
    if(n == 0) s1 = 1;
    else if(r == 0) s2 = 1;
    else if(n == r) s3 = 1;
 
	int minus = n-r;
    while(minus > 1){
        s3 *= (minus-1);
        minus--;
    }
 
    while(n > 1){
        s1 *= (n-1);
        n--;
    }
    while(r > 1){
        s2 *= (r-1);
        r--;
    }
 
 
    int ans = s1 / (s2 * s3);
    printf("%d", ans);
    return 0;
} 
