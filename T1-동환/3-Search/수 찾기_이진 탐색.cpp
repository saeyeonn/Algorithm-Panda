#include <stdio.h>
#include <stdlib.h>

// 이진탐색 - 수 찾기 

int compare(const void* a, const void* b)
{
    if(*(int*)a > *(int*)b)
        return 1;
    else if(*(int*)a == *(int*)b)
        return 0;
    else return -1;
}

int binarySearch(int* array, int size, int wtf){ // 배열, 크기, 찾아야할 값.
    int mid = 0;
    int start = 0;
    int end = size - 1;
    
    while(start <= end){
        mid = (start + end) / 2;
        if(array[mid] == wtf) return 1;
        else if(array[mid] > wtf) end = mid -1;
        else if(array[mid] < wtf) start = mid + 1;
    }
    return 0;
}

int main(){
    int list = 0;
    scanf("%d", &list);
 
    int origin[list] ={0};
    for(int i = 0; i < list; i++){
        scanf("%d", &origin[i]);
    }
    
    
    int test = 0;
    scanf("%d", &test);
 
    int find[test] = {0};
    for(int i = 0; i <test; i++){
        scanf("%d", &find[i]);
    }
    qsort(origin, list, sizeof(int), compare); // 퀵정렬을 통해, 이진 탐색을 진행할 배열을 정렬함.
    
    for(int i = 0; i < test; i++){
        printf("%d\n", binarySearch(origin, list, find[i])); // 탐색 진행
    }
    
    return 0;
}
