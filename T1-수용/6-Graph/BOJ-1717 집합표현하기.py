import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline
n,m = map(int, input().split())
lst = [i for i in range(n+1)]

def find(a):
    if a == lst[a]:
        return lst[a]
    else:
        lst[a] = find(lst[a])
        return lst[a]
    
def union(a,b):
    i = find(a)
    j = find(b)
    if i < j:
        i,j = j,i
    if i != j:
        lst[j] = i

def checkSame(a,b):
    i = find(a)
    j = find(b)
    if i == j:
        return True
    else:
        return False

for _ in range(m):
    t,a,b = map(int, input().split())
    if t == 0:
        union(a,b)
    else:
        if checkSame(a,b):
            print('YES')
        else:
            print('NO')