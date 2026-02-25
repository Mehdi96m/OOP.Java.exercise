

public class App {

    static void displaya( Person [] out)
    {
        
        for (int i = 0; i < out.length; i++) {
            String gg = out[i].display();
            System.out.println(gg);
        }

    }


     
    

    public static void main(String[] args)  {
        Customer[] list1 = new Customer[5];


        list1[0] = new Customer(3521,"Kasun",27,'M',3);
        list1[1] = new Customer(4863,"Nimal",23,'M',2);
        list1[2] = new Customer(5763,"Nayana",28,'F',4);
        list1[3] = new Customer(2456,"Chathura",32,'M',1);
        list1[4] = new Customer(7593,"Waruni",18,'F',2);



          /*q) Increment the value of the attribute level of the fourth Customer object by 1. */




        list1[3].setLevel(list1[3].getLevel() + 1 );

          /*r) Change the value of the attribute gender of the third Customer object to „M‟. */




          list1[2].setGender('M');



          /*s) Use the method display in the class Customer to display the values of attributes of
          second and third Customer objects. */


          String Sec = list1[1].display();
          String third = list1[2].display();


          double Avrageage = Person.getAverageAge(list1);


     






             list1[0].buyItems(54, 57, 8);
             list1[0].buyItems(32, 39, 5);
             list1[0].buyItems(75, 76, 7);


            list1[1].buyItems(45, 48, 9);
            list1[1].buyItems(78, 81, 12);
            list1[1].buyItems(12, 14, 17);
            list1[1].buyItems(24, 27, 4);




            list1[2].buyItems(92, 96, 8);
            list1[2].buyItems(130, 39, 10);




             list1[3].buyItems(82, 89, 7);
             list1[3].buyItems(138, 155, 6);
             list1[3].buyItems(52, 60, 2);
             list1[3].buyItems(66, 75, 11);
             list1[3].buyItems(105, 120, 21);



             list1[4].buyItems(99, 110, 2);


             for (int i = 0; i < list1.length; i++) {
                list1[i].calculateProfit();
             }

             for (int i = 0; i < list1.length; i++) {
                list1[i].reduceProfit();
             }



             /*Create an array that holds seven FullTimeEmployee objects. Assign the objects given in
                the table below to each array element using the constructor. */



                FullTimeEmployee[] fullTimeEmployees = new FullTimeEmployee[7];

                fullTimeEmployees[0] = new FullTimeEmployee(6894, "Nuwan", 52, 'M',"Manager","0516859465",3);
                fullTimeEmployees[1] = new FullTimeEmployee(98451, "Charaka", 29, 'M', "Assistant Manager", "0919576348", 2);
                fullTimeEmployees[2] = new FullTimeEmployee(79563, "Wathsala", 34, 'F', "Clerk", "0668567956", 1);
                fullTimeEmployees[3] = new FullTimeEmployee(36864,"Chathurika",35,'F',"Clerk","0219762354",2);
                fullTimeEmployees[4] = new FullTimeEmployee(48952, "Sandun", 27, 'M', "Laborer", "0319548261", 1);
                fullTimeEmployees[5] = new FullTimeEmployee(65825, "Janith", 21, 'M', "Laborerec", "0119652352", 0.5);
                fullTimeEmployees[6] = new FullTimeEmployee(56286, "Chamari", 38, 'F', "Clerk", "0512648927", 2);



                /* Set the value of the attribute salary of each FullTimeEmployee object according
                   to the table given below. */


                   fullTimeEmployees[0].setsalary(65000);
                   fullTimeEmployees[1].setsalary(60000);
                   fullTimeEmployees[2].setsalary(35000);
                   fullTimeEmployees[3].setsalary(30000);
                   fullTimeEmployees[4].setsalary(20000);
                   fullTimeEmployees[5].setsalary(25000);
                   fullTimeEmployees[6].setsalary(40000);


                   for (int i = 0; i < fullTimeEmployees.length; i++) {

                    fullTimeEmployees[i].addToFund();
                    
                   }

                   /*Create an array that holds two PartTimeEmployee objects. Assign the objects given in
                    the table below to each array element using the constructor. */



                    PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[2];
                    partTimeEmployees[0] = new PartTimeEmployee(68542, "Saman", 56, 'M', "Temporary Clerk", "0215698542", 300);
                    partTimeEmployees[1] = new PartTimeEmployee(79546, "Nimal", 57, 'M', "Temporary Laborer", "081684952", 150);




                    partTimeEmployees[0].sethours(160);
                    partTimeEmployees[1].sethours(172);

                    for (int i = 0; i < partTimeEmployees.length; i++) {
                        partTimeEmployees[i].computeSalary();
                    }



                    /*Create an array of type Employee that has nine elements. Assign the seven
                      FullTimeEmployee objects and the two PartTimeEmployee objects you have created to
                      each array element. */

                      Employee[] employees = new Employee[9];

                      for (int i = 0; i < fullTimeEmployees.length; i++) {

                        employees[i] = fullTimeEmployees[i];
                        
                      }
                      for (int i = 0; i < partTimeEmployees.length; i++) {

                        employees[i + fullTimeEmployees.length] = partTimeEmployees[i];
                        
                      }

                      for (int i = 0; i < employees.length; i++) {
                        employees[i].computeTax(0.03);
                      }


                      /*Update the value of the attribute salary of each Employee object using the method
                       getNetSalary of the class Employee. */


                       for (int i = 0; i < employees.length; i++) {
                         double net_salary = employees[i].getNetSalary();
                         employees[i].setsalary(net_salary);
                       }



                       double avragesalary = Employee.getAverageSalary(employees);

                       System.out.println(" Avrage salary = " + avragesalary);














            
          
          displaya(employees);
          

        











      



      


      


       

        












        


        






        
    }
}
