#include<iostream>
#include<string.h>
using namespace std;
class student{
private:
string name;
string rollno;
int marks;
string section;

public:
student(string n,string r,int m,string s)
{
    name=n;
    rollno=r;
    marks=m;
    section=s;
}
void display()
{
    cout<<"name:"<<name<<endl;
    cout<<"Roll no:"<<rollno<<endl;
    cout<<"marks:"<<marks<<endl;
    cout<<"section"<<section<<endl;
    cout<<endl;
}
};
int main()
{
    student s1("pr","4sf",45,"3c");
    student s2("pk","4hf",95,"4c");
    s1.display();
    s2.display();
}
// fzxpr0264j  c70btxxi
