#include <iostream>
using namespace std;

class Student{
	private:  // Access specifier: private data members are not directly accessible outside the class
		string stdName;
		double CGPA;
		
	public:   // Access specifier: public methods are accessible outside the class

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
	S1.setName("M.Ali Arslan",3.097);  // Setting the student's name and CGPA
	S1.displayName();
	return 0;
}
