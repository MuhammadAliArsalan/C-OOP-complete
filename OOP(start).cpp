/*#include <iostream>
using namespace std;

class Person{
    public:     //access specifier
      string Name;
      int age;

};
int main(){
    Person P1;    // P1 is object
    P1.Name="M.Ali";
    P1.age=21;

    cout<<"Person's name is "<<P1.Name<<endl; 
    cout<<"His age is "<<P1.age;

    return 0;
}*/


//Second method of doing above question, in this we have also defined 2 methods inside class

#include <iostream>
using namespace std;

class Person2{
	private:
		string Name;
		int age;
		string address;
		
	public:
		
		void getDetails(){    // method to get person's details
			cout<<"The name of person is :";
			cin>>Name;
			
			cout<<"The age of "<<Name<<" is: ";
			cin>>age;
			
			cin.ignore();
			
			cout<<Name<<" lives at: ";
			getline(cin,address);	
	    }
	    
	    void displayDetails(){     //method to display Person's details on console
	    	cout<<"This is "<<Name<<" who is "<<age<<" years old and lives at "<<address<<endl;
		}
	    
};

int main(){

	Person2 P2;   //P2 is object
	P2.getDetails();
	cout<<"\tPERSON's DETAILS"<<endl;
	P2.displayDetails();
	return 0;
	
}
	





