//POLYMORPHISM

//METHOD OVERLOADING  --COMPILE TIME POLYMORPHISM
/*public class Animal {
    int Add(int a,int b){
        System.out.println("Sum of integers: " + (a + b));
       
        return a+b;

    }
    void Add(String a,String b){
        System.out.println(a+","+b);
    }
    double Add(double a , double b){
        System.out.println("Sum of decimals: " + (a + b));
        return a+b;
    }
    public static void main(String[] args) {
        Animal display=new Animal();
        display.Add(34.99, 89.23);
        display.Add("Ali", "Arslan");
        display.Add(134,156);
        
    }

    
}*/

// RUN_TIME PLOYMORPHISM  -- METHOD OVERRIDING
class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dogs bark");
    }
}
class Hen extends Animal{
    @Override
    void makeSound(){
        System.out.println("Hen crooks!!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meows!");
    }
}
public class tut8{
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal myCat=new Cat();
        Animal myDog=new Dog();

        animal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
    

}



