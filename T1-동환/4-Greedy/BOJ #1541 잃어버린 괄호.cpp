#include <stdio.h>

int main(){
	int number[25] = {0}; # 
	
	bool flag = 1;
	
	int sum = 0;
	
	/* 
	
	생각 전개: 제시되는 수식을 숫자의 나열로 파악함 ex) 5+6-7 -> 5, 6, -7
	음수가 등장하는 경우, 해당 부분 부터는 이후에 등장하는 수를 괄호로 묶을 수 있다
	-> 그래서 음수가 등장한 이후의 숫자는 모두 절댓값에 -를 붙인 값으로 계산을 진행함. 
	
	*/ 
	
	for(int i = 0; i < 25; i++){
		scanf("%d", &number[i]);
		if(flag == 1 && number[i] < 0) flag = 0;  
		else if(flag == 0 && number[i] > 0) number[i] *= -1; // 음수가 등장한 이후의 계산 진행. 
		
		sum += number[i];
	}
	
	printf("%d", sum);
	return 0;
}
