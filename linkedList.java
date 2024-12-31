import java.util.LinkedList;

/*public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList<>();
        cars.add("Volvo");
        cars.add("Suzuki");
        cars.add("Toyota");

        System.out.println("Cars: "+cars);

        //Add an item to the beginning of the list

        cars.addFirst("Mercdes-Benz");
        System.out.println("Cars: "+cars);  //Cars: [Mercdes-Benz, Volvo, Suzuki, Toyota]

        cars.addLast("Tesla");
        System.out.print("\nCars: "+cars);  //Cars: [Mercdes-Benz, Volvo, Suzuki, Toyota, Tesla]

        cars.add(2,"Cheverlot" );
        cars.add(1, "Hyundai");

        System.out.println("\nCars: "+cars);

        //Get first item
        System.out.println("Car at index 0: "+cars.getFirst());

        //Get last item

        System.out.println("Last car in list: "+cars.getLast());

        //get item at specified index
        System.out.println("Car at index4: "+cars.get(4));


        //
        System.out.println("Cars updated: "+cars.removeFirst());  //Mercdes-Benz

        System.out.println("Cars updated (2): "+cars.removeLast());   // Tesla


    }    
}*/
//Adding objects in linkedList

class Person{
    String Name;
    int age;

    public Person(String N,int a){
        Name=N;
        age=a;
    }
    @Override
    public String toString(){
        return "Name: "+Name+" and age is "+age;
    }


}
public class linkedList{
    public static void main(String[] args) {
        LinkedList<Person>persons=new LinkedList<>();

        persons.add(new Person("M.Ali", 29));
        persons.add(new Person("Hasan", 29));
        persons.add(new Person("Khan", 50));

        Object first=persons.getFirst();
        System.out.println("First: "+first);  //First: Name: M.Ali and age is 29

        for(Person person:persons){
            System.out.println(person);
        }
    }
    
}
