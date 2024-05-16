#include <stdio.h>
 
int main(){
    int n = 0, k = 0;
    scanf("%d %d", &n, &k);
 
    int array[n] = {0};
    for(int i = 0; i < n; i++){
        scanf("%d", &array[i]);
    }
    
    int count = 0;
    for(int i = n-1; n >= 0; i--){
        while(k > 0){
        k -= array[i];
        count++;
        }
        if(k == 0) {
            printf("%d", count);
            break;
        }
        else {
            k += array[i];
            count--;
        }
    }
 
}
