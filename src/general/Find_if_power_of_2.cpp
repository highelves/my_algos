#include<cstdio>
using namespace std;
int main(){
  int n;
  scanf("%d",&n);
  if(n && !(n&(n-1))){
    printf("T\n");
  }
  else
    printf("F\n");
  return 0;
}
