#include <iostream>
#include <string>
using namespace std;

string palindromic(string str,int n)
{
    string pstr;
    int i;
    for(i=0;i<n;i++)
    {
        if(str[i]==str[i+1])
        {
            pstr = str.substr(i,2);
            break;
        }
    }
    return pstr;
}

int main()
{
    string str,res;
    int len,i;
    cout<<"Enter the string : ";
    cin>>str;
    len = str.length();
    res = palindromic(str,len);
    
    if(res.empty())
    {
        cout<<"Error\n";
    }
    else{
        cout<<"\nSmallest palindromic substring is "<<res;
    }
}