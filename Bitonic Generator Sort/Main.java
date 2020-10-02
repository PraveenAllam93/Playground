#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    int t;
    scanf("%d", &t);
    while(t) {
      t--;
      int n, i;
      scanf("%d",&n);
      int *arr;
      arr = (int*)malloc(n * sizeof(int));
      for(i = 0;i < n;i++) scanf("%d", &arr[i]);
      vector <int> evenArray,oddArray;
      for(i = 0;i < n;i++) {
        if(i % 2 == 0) {
          evenArray.push_back(arr[i]);
        }
        else{
          oddArray.push_back(arr[i]);
		}
      }
     sort(evenArray.begin(),evenArray.end());
     sort(oddArray.begin(),oddArray.end(),greater<int>());
     for(i = 0; i < evenArray.size(); i++) printf("%d ", evenArray[i]); 
     for(i = 0; i < oddArray.size(); i++) printf("%d ", oddArray[i]); 
     free(arr);
     printf("\n"); 
      
    }
    return 0;
}