#include <iostream>
using namespace std;

class Student{
	private:  //acess specifier
		string stdName;
		double CGPA;
		
	public:   //acess specifer
		void setName(string name,double grades){
			stdName=name;
			CGPA=grades;
		}
	    void displayName(){
	    	cout<<"The student's name is: "<<stdName<<" and his CGPA is "<<CGPA;
		}
		
};
int main(){
	cout<<"\t\t\tDETAILS"<<endl;
	Student S1;
	S1.setName("M.Ali Arslan",3.097);
	S1.displayName();
	return 0;
}