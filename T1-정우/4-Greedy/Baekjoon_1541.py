# '-'연산자를 기준으로 나누어서, 
# 음수의 값이('-'연산자 뒤에 있는 값을) 통으로 묶어버리면
# 연산 결과를 가장 작은 값으로 만들 수 있음

formula = input().split('-') # '-'연산자를 기준으로 split

sum = 0

for i in formula[0].split('+'): # 첫 번째 더하기 연산(덩어리) 먼저 + 처리
    sum += int(i) # sum에 더해줌

for i in formula[1:]: #뒤 덩어리들은 모두 - 처리
#(앞에서 - 연산자를 기준으로 split했기 때문에, 뒤 덩어리들은 괄호 앞에 -가 붙어있다는 뜻)

    for j in i.split('+'): # 1: 의 덩어리들은 각각의 숫자를 모두 빼줘야함(괄호 앞 -, 분배)
        sum -= int(j)

print(sum)
