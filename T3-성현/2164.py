#include <iostream>
#include <queue>
#include <vector>
#include <cmath>
using namespace std;
int main(int argc,char**argv) {
    ios::sync_with_studio(0);
    cin.tie(0);

    queue<int> Q;
    int n;
    cin>>n;

    for(int i=1;i<=n;i++){
        Q.push(i);
        }

    while(Q.size()>1){
        Q.pop();
        Q.push(Q.front());
        Q.pop();
        }
    cout<<Q.front();

    return 0;
}
            
