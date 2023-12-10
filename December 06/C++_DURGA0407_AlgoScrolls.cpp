#include <iostream>
#include<string>
using namespace std;

int main()
{
    int n,i,j,k,count,flag;
    cin>>n;
    string words[n];
    for(i=0;i<n;i++)
        cin>>words[i];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(words[i].length()==words[j].length())
            {
                count=0;
                for(k=0;k<words[i].length();k++)
                {
                    if(words[i][k]!=words[j][k])
                    {
                        count=count+1;
                        if(count>1)
                        {
                            break;
                        }
                    }
                }
                if(count == 1)
                {
                    cout<<words[i]<<"\t";
                    break;
                }
            }
        }
    }
}
