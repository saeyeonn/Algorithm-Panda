from collections import deque
card = deque(iter(range(1,int(input())+1)))

while len(card) != 1:
    card.popleft()
    A = card[0]
    card.append(A)
    card.popleft()
    
print(card[0])