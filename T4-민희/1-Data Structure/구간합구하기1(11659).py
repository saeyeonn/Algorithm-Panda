k = input()
n = int(k[0])
m = int(k[2])
sum = 0 # 합이 들어갈 자리
number= input()
number = number.replace(" ","")
numbers = list(number)

for x in range(m) :
    section = input()
    i = int(section[0])
    j = int(section[2])
    selected_part = numbers[(i-1):j]
    for y in selected_part :
        sum = sum + int(y)
    print(sum)
    sum = 0
