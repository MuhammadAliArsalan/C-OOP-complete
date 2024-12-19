//CONSTRUCTORS


/*public class tut3{
    int myAge;

    public tut3(){
        myAge=21;
    }
    public static void main(String[]args){
        tut3 sayAge=new tut3();
        System.out.println("My age is "+sayAge.myAge);

    }
};*/

// public class tut3{
//     int age;

//     public tut3(int a){
//         age=a;

//     }
//     public static void main(String[]args){
//         tut3 sayAge=new tut3(21);
//         System.out.println(("My age is "+sayAge.age));

//     }
// }


public class tut3{
    int model;
    String carName;

    private tut3(int m, String cN){
        model=m;
        carName=cN;
    }
    public static void main(String[]args){
        tut3 info=new tut3(2010,"Suzuki Mehran");
        System.out.println("CAR's INFO: "+info.carName+" "+info.model);
    }


}
