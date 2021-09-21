#include <bits/stdc++.h>
using namespace std;
int AllIndexesRecursive(int input[], int size,
                    int x, int output[])
{
    if (size == 0) {
        return 0;
    }
    int smallAns = AllIndexesRecursive(input + 1,
                                    size - 1, x, output);
 
    if (input[0] == x) {
        for (int i = smallAns - 1; i >= 0; i--) {
            output[i + 1] = output[i] + 1;
        }
        output[0] = 0;
        smallAns++;
    }
    else {
        for (int i = smallAns - 1; i >= 0; i--) {
            output[i] = output[i] + 1;
        }
    }
    return smallAns;
}
void AllIndexes(int input[], int n, int x)
{
    int output[n];
    int size = AllIndexesRecursive(input, n,
                                x, output);
    for (int i = 0; i < size; i++) {
        cout << output[i] << " ";
    }
}
int main()
{
    int n,x;
    cout<<"Enter number of elements";
    cin>>n;
    int i,arr[n];
    cout<<"Enter array elements";
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter element whose position is to be returned";
    cin>>x;
    AllIndexes(arr, n, x);
     
    return 0;
}
