import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class tut1{
    String fName="Ali";
    String lName="Hasan";
    
    static void getAge(){
        Scanner promptage=new Scanner(System.in);
        System.out.print("Enter the age of person: ");
        int age=promptage.nextInt();
        System.out.println("Age: "+age);

        promptage.close();
    }
    public static void main(String[] args){
        tut1 Person=new tut1();
        System.out.println("Person's full name is "+Person.fName+""+Person.lName);
        tut1.getAge();  //accessed getAge in a static way b/c keyword "static" is used with getAge method

    }
}
//  -------------------

public class tut1{

    double GPA=3.23;

    void getName(){

      //Using Scanner to take user input from the console (nextInt(), nextLine()).

        Scanner name=new Scanner(System.in);
        System.out.println("The name of student is: ");
        String studentName=name.nextLine();
        System.out.println("The name of student is "+studentName);
    
        name.close();
    }
    public static void main(String[] args){
        tut1 StdName=new tut1();
        tut1 StdName2=new tut1();
        StdName2.GPA=3.38;

        StdName.getName();
        System.out.println("His GPA in 3rd semester "+StdName.GPA);
        System.out.println("His GPA in 4th semester "+StdName2.GPA);
    }
}

// --------------------------------


class MathUtils{
    static double PI=3.42;
}
public class tut1{
    
    final double SPEED_OF_LIGHT=299792458;  //final keyword to declare constants that cannot be reassigned (SPEED_OF_LIGHT).

    public static void main(String[] args){
        tut1 changeValue=new tut1();
        System.out.print("Value of PI is "+MathUtils.PI); //Static variables like PI that belong to the class,
        changeValue.SPEED_OF_LIGHT=213456782;  // gives error
        System.out.println("The speed of light is "+changeValue.SPEED_OF_LIGHT);

    }

}
