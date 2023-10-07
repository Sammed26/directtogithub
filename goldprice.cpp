#include<iostream>
#include <vector>
using namespace std;


vector<int> gold(int array[], int n)
{
    vector<int> ans(n);

    for(int i = 0; i<n; i++)
    {
        ans.push_back(0);
    }

    for(int i = n-1; i>=0; i--)
    {
        for(int j = i-1; j>= 0; j--)
        {
            if(array[j] < array[i])
            {
                ans[i]++;
            }
        }
    }
    return ans;
}


int main(){

    int n;
    cout<<"enter size of array"<<endl;

    int array[n];
    cout<<"enter array"<<endl;
    for(int i = 0; i<n; i++)
    {
        cin>>array[i];
    }

    vector<int> ans = gold(array, n);

    for(int i = 0; i<n; i++)
    {
        cout<<ans[i]<<" ";
    }

    return 0;
}
