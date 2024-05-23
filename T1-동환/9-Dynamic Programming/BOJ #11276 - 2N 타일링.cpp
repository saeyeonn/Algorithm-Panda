#include <stdio.h>


long long arr[1001] = {0};
int ans[1001] = {0};


void fibo(int n){
	arr[0] = 1;
	arr[1] = 1;
	ans[0] = 1;
	ans[1] = 1;
	for(int i = 2; i <= n; i++){
		arr[i] = (arr[i-2] % 10007 + arr[i-1] % 10007);
		ans[i] = arr[i] % 10007;
	}
}

int main(){
	int n;
	scanf("%d", &n);
	
	fibo(n);
	
	printf("%d", ans[n]);
	return 0;
}
