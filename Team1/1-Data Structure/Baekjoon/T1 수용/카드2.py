from collections import deque
lst = [i for i in range(1,int(input())+1)]
card = deque(lst)

while len(card) != 1:
    card.popleft()
    a = card.popleft()
    card.append(a)

print(card[-1])