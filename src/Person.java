
public class Person {

    /*Create the class Person that includes attributes: id, name, age, and gender with data
types: “int”, “String”, “int”, and “char” respectively. */



    

     protected int id;
     protected String name ;
     protected int age ;
     protected char gender;

     


     public Person(int id,String name ,int age,char gender)
     {
      this.id = id;
      this.name = name;
      this.age = age;
      this.gender = gender;
     }
     

     //getters 

     public void setGender(char gender) { this.gender = gender; }

     public void setAge(int age) { this.age = age;}

     public void setId(int id) {  this.id = id;}

     public void setName(String name) { this.name = name;}




     //setters

     public int getAge() {  return age;  }

     public char getGender() { return gender;  }

     public String getName() { return name; }

     public int getId() {return id; }



     public String  display()
     {
        String out = "";
        out +="User name :" + name + "\n";
        out +="User ID :" + id + "\n";
        out +="User Age :" + age + " \n";
        out +="User Gender :" + gender +  "\n";
        return out;
     }

      static double getAverageAge(Person[] avgage)
     {
        double sum  = 0.0; 
        double avg = 0.0 ;
        for (int i = 0; i < avgage.length; i++) {

            sum += (double) avgage[i].getAge();
            
        }

        avg = sum/ avgage.length;
        
        
        return avg;




     }





     








}
