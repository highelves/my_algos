#include"../../../../config/stdc++.h"

int main(){
    int s,t,a,b,m,n,apple_count=0,orange_count=0,position_from_a,position_from_b;
    cin >> s >> t;
    cin >> a >> b;
    cin >> m >> n;
    vector<int> apple(m),orange(n);
    for(int apple_i = 0;apple_i < m;apple_i++){
       cin >> apple[apple_i];
       if (a+apple[apple_i]>=s && a+apple[apple_i]<=t){
           apple_count++;
       }
    }
    for(int orange_i = 0;orange_i < n;orange_i++){
       cin >> orange[orange_i];
       if (b+orange[orange_i]>=s && b+orange[orange_i]<=t){
           orange_count++;
       }
    }
    printf("%d\n%d\n",apple_count,orange_count);
    return 0;
}
