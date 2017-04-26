#include<cstdio>
using namespace std;
int main(){
  int n,j;
  scanf("%d",&n);
  int max=0,count=0;
  for(int i=0;i<n;i++){
    scanf("%d",&j);
    if(max<j){
      max=j;
      count=1;
    }
    else if(max==j){
      count++;
    }
  }
  printf("%d\n",count);
  return 0;
}
