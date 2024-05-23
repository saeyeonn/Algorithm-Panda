#include <stdio.h>
 
int main(){
    int small = 0;
    int big = 0;
    scanf("%d %d", &small, &big);
 
    int array[168];
 
    int count = 0;
    for(int i = 2; i <= 1000; i++){
        for(int j = 2; j <= i; j++){
            if(((i % j) == 0) && (i != j)) break;
            else if(((i % j) == 0) && (i == j)) {
                array[count] = i; // 1000까지의 소수.
                count++;
            }
        }    
    }
 
    long num[1000005] = {0};
    for(int i = 0; i < 1000005; i++){
        num[i] = i+1; // 1 ~ 1000005
    }
    int k, j;
    for(int i = 0; i < 168; i++){
        k = 0, j = 2;
        while(k <= 1000000){
            k = array[i] * j;
 
            if( k <= 1000000) num[k-1] = 0;
            j++;
        }
    }
 
 
    for(int i = 1; i < 1000005; i++){
    	if(num[i] >= small && num[i] <= big && num[i] != 0) printf("%ld\n", num[i]);
    }
    return 0;
}
