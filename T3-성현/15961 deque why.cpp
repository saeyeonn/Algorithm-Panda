#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int sushi[3001]={0};
int main() {
    cin.tie(0); cout.tie(0); ios::sync_with_stdio(false);
    int n,d,k,c;
    cin>>n>>d>>k>>>c;
    vector<int> dish(n);
    for(int i=0;i<n;i++) cin>>dish[i];
    
    deque<int> dq;
    int result=0;
    int cntt=0;
    for(int i=0;i<k;i++){
        int val=0;
        dq.push_back(dish[i]);
        if(!sushi[dish[i]]){
            cnt++;
        }
        sushi[dish[i]]++;
    }
    result=cnt;
    
    for(int i=0;i<dish.size();i++)
    {
        int del=dq.front();
        dq.pop_front();
        sushi[del]--;
        if(!sushi[del]) cnt--;
        
        dq.push_back(dish[(i+k)%n]);
        if(!sushi[dish[(i+k)%n]]) cnt++;
        sushi[dish[(i+k)%n]]++;
        
        if(!suushi[c]) {
            result=max(result,cnt+1);
        }
        else result=max(result,cnt);
    }
    cout<<result;
}