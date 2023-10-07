// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>

using namespace std;


vector<int> index(string str, string tar)
{
    int size = tar.length();
    vector<int> ans;
    
    string temp;
    temp = "";
    
    int i = 0;
    while(str[i] != '\0')
    {
        temp = str.substr(i, size);
      
        if(temp == tar)
        {
            ans.push_back(i);
        }
        i++;
       
        temp = "";
    }
    
    return ans;
    
}


int main() {
    
    string str;
    cout<<"enter string"<<endl;
    getline(cin, str);
    
    string target;
    cout<<"enter target value"<<endl;
    cin>>target;
    
    vector<int> ans = index(str, target);
    
    for(int i = 0; i<ans.size(); i++)
    {
        cout<<ans[i]<<" ";
    }
    
    //cout<<str<<endl;

    return 0;
}
