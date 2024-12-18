/*public class tut4 {
    final double PI=3.142;
    final double myGPA=3.34;

    public static void main(String[] args){
        tut4 num=new tut4();
        num.PI=23;  //error will generate
        num.myGPA=2.09; //error will generate

    }
}*/
import java.util.Scanner;


public class tut4{
    
    static void myName(){  //static method
       
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter your name plz:");
        String Name=inp.nextLine();

        inp.close();
        System.out.print("The name of person is "+Name);

    }
    public int Age(int a){
        return a;
    }
    public static void main(String[] args) {
        myName();
        tut4 age=new tut4();
        int AGE=age.Age(21);
        System.out.println("\nAge: "+AGE);
    }
}

