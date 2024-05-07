# 입력 받기
N = int(input())
A = list(map(int, input().split()))
M = int(input())
arr = list(map(int, input().split()))

A.sort()  # 리스트 A 정렬 -> 이분탐색: 중앙값을 기준으로 진행하기 떄문에 sort가 필수

def binary_search(sorted_list, target):
    left, right = 0, len(sorted_list) - 1

    while left <= right:
        mid = (left + right) // 2
        if sorted_list[mid] == target: #중앙값이 목표값인 경우
            return 1  # 찾앗다
        elif sorted_list[mid] < target:
            #목표값이 중앙값보다 크면 중앙을 기준으로 왼쪽 구역을 탐색
            left = mid + 1 
        else:
            right = mid - 1
            #목표값이 중앙값보다 작으면 중앙을 기준으로 오른쪽 구역을 탐색 
    return 0 



# arr의 각 원소에 대해 이진 탐색 수행
results = [binary_search(A, num) for num in arr]
print('\n'.join(map(str, results)))  
