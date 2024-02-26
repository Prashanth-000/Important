#include<iostream>
using namespace std;
class calc{
    public:

    int sum(int a,int b){
        return a+b;
    }
    int diff(int a,int b){
        return a-b;
    }
    int pro(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return (b==0)?0:a/b;
    }
    float sum(float a,float b){
        return a+b;
    }
    float diff(float a,float b){
        return a-b;
    }
    float pro(float a,float b){
        return a*b;
    }
    float div(float a,float b){
        return (b==0)?0:a/b;
    }
};
int main()
{
    calc c;
    int x,y;
    float p,q;
    cout<<"Enter 2 int"<<endl;
    cin>>x>>y;
    cout<<"Enter 2 float"<<endl;
    cin>>p>>q;
    cout<<"\nInt calculatore"<<endl;
    cout<<"int sum:"<<c.sum(x,y)<<endl;
    cout<<"int difference:"<<c.diff(x,y)<<endl;
    cout<<"int product:"<<c.pro(x,y)<<endl;
    cout<<"int division:"<<c.div(x,y)<<endl;
    cout<<"\nfloat calculatore"<<endl;
    cout<<"float sum"<<c.sum(p,q)<<endl;
    cout<<"float differnce"<<c.diff(p,q)<<endl;
    cout<<"float product"<<c.pro(p,q)<<endl;
    cout<<"float division"<<c.div(p,q)<<endl;
    return 0;
}
