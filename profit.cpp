#include<iostream>
#include <vector>
using namespace std;


int gold(int array[], int n)
{
    //vector<int> ans(n);

    int profit = 0;

    for(int i = 0; i<n; i++)
    {
        for(int j = i+1; j<n; j++)
        {
            if(array[i] < array[j])
            {
                profit = (array[j] - array[i])>profit? (array[j] - array[i]): profit;
            }
        }
    }
    return profit;
}


int main(){

    int n;
    cout<<"enter size of array"<<endl;
    cin>>n;

    int array[n];
    cout<<"enter array"<<endl;
    for(int i = 0; i<n; i++)
    {
        cin>>array[i];
    }

    int profit = gold(array, n);
    
    cout<<"profit is "<<profit<<endl;

    return 0;
}
