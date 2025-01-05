/*
What is a Map in Java?
A Map is a part of the Java Collections Framework and is used to store data in the form 
of key-value pairs. 
Each key in a Map is unique, and each key maps to exactly one value.
 */

import java.util.HashMap;

/*public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities=new HashMap<String,String>();


        //ADDIng elements in hashMap
        capitalCities.put("Pakistan", "Islamabad");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Turkey", "Ankara");
        capitalCities.put("France", "Paris");

        System.out.println("The countries and thier capitals are "+capitalCities);
        //OUTPUT of above statement
        //The countries and thier capitals are {Pakistan=Islamabad, Turkey=ANkara, China=Beijing}

        //Access an item
        String capital1=capitalCities.get("China");
        String capital2=capitalCities.get("Turkey");

        System.out.println(capital1+" "+capital2);

        capitalCities.remove("France");  //removing an item

        int sizeOf=capitalCities.size();
        System.out.println("Size of hashMap is "+sizeOf);

        //Print keys
        System.out.println("\tKEYS");
        for(String i:capitalCities.keySet()){
            System.out.println((i));
        }

        //Print values
        System.out.println("\tVALUES");
        for(String i:capitalCities.values()){
            System.out.println(i);
        }
        //Print keys and values
        System.out.println("-------------------");

        for(String i:capitalCities.keySet()){
            System.out.println(i+" = "+capitalCities.get(i));
        }

       // Checking for Keys or Values:
       boolean isTrue=capitalCities.containsKey("Islamabad");  //false
       boolean isFalse=capitalCities.containsValue("Vienna");  //false

       System.out.println(isFalse+" "+isTrue);

    }
    //NOTE:
    //The keySet() method of the Map interface returns a Set containing all the keys in the Map.
    
    //NOTE: Keys and values in a HashMap are actually objects.
     
}*/

public class hashMap {
    public static void main(String[] args) {

        // Create a HashMap to store students' names (keys) and GPAs (values)
        HashMap<String, Double> Students = new HashMap<String, Double>();

        // ADDING students
        Students.put("Ali", 3.094);
        Students.put("Hasan", 3.700);
        Students.put("Salman", 3.943);
        Students.put("Muneeb", 3.521);
        Students.put("Jhanzaib", 3.451);

        // Iterating through the HashMap and printing all key-value pairs
        for (String i : Students.keySet()) {
            System.out.println(i + " = " + Students.get(i));
        }

        // Using putIfAbsent to add a new entry only if the key "Ahmed" is absent
        Students.putIfAbsent("Ahmed", 3.290);
        System.out.println(Students); // {Ahmed=3.29, Hasan=3.7, Muneeb=3.521, Salman=3.943, Jhanzaib=3.451,
                                      // Ali=3.094}

        Double val5 = Students.putIfAbsent("Khan", 2.890); // Adds "Khan" because it's absent
        Double val6 = Students.putIfAbsent("Ahmed", 3.190); // Does NOT add "Ahmed" because it's already present

        System.out.println(val5 + " " + val6);

        System.out.println(Students); // {Ahmed=3.29, Hasan=3.7, Muneeb=3.521, Salman=3.943, Jhanzaib=3.451,
                                      // Khan=2.89, Ali=3.094}

    }
}
