#include <iostream>
#include <math.h>
using namespace std;

int rectangleincircle(float l,float b,float r)
{
    double diag,sum,diameter;
    sum = pow(l,2) + pow(b,2);
    diag = sqrt(sum);
    diameter = 2*r;
    cout<<diag<<" "<<diameter;
    if(diag>diameter)
    {
        return 0;
    }
    else
        return 1;
}

int main()
{
    int len,width,radius;
    cin>>len>>width>>radius;
    int res = rectangleincircle(len,width,radius);
    if(res == 1)
        cout<<"\ntrue";
    else
        cout<<"\nfalse";
}
