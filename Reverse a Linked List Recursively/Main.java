#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int t;
    scanf("%d", &t);
    while(t) {
      t--;
      int n;
      scanf("%d", &n);
      int arr[104];
      int i;
      for(i = 0;i < n;i++) scanf("%d", &arr[i]);
      for(i = n-1 ;i >= 0;i--) printf("%d ", arr[i]);
      printf("\n");
      
      
    }
    return 0;
}