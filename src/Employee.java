public class Employee extends Person {

/*Create the class Employee that includes attributes: designation, mobile, salary and tax
with data types: “String”, “String”, “double” and “double” respectively. */



private String designation;
private String mobile;
private double salary;
private double tax;

/*z) Include a constructor to the class Employee with parameters: id, name, age, gender,
designation, and mobile. */

public Employee(int id,String name ,int age,char gender,String designation, String mobile)
{
    super(id, name, age, gender);
    this.designation = designation;
    this.mobile = mobile;


}
public void setdesignation(String designation)
{
    this.designation = designation;
}
public void setmobile(String mobile)
{
    this.mobile = mobile;

}
public void setsalary(double salary)
{
    this.salary = salary;
}
public void settax(double tax)
{
    this.tax = tax;
}
public String getdesignation()
{
    return designation;
}
public String getmobile()
{
    return mobile;
}
public 
double getsalary()
{
    return salary;
}
public double gettax()
{
    return tax;
}

@Override
public String display()
{
    String output = "Designation : " + designation +"\n" + "Mobile : " + mobile + "\n" + "Salary : " + salary + "\n" + "Tax : " +tax +" \n"; 
    return super.display() + output;

}



public static  double  getAverageSalary(Employee[] employees)
{
    double avragesalary = 0.0;
    for (int i = 0; i < employees.length; i++) {
        avragesalary += employees[i].getsalary();
    }
    avragesalary /= employees.length;

    return avragesalary;
  
}


/*Include a method called computeTax to the class Employee with the parameter taxRate
to compute the value of the attribute tax. The value of the attribute tax is computed by
multiplying the value of the attribute salary with the value of the attribute taxRate. */



public void computeTax(double taxrate)
{
    tax =  salary * taxrate;
}




/*ee) Include a method called getNetSalary to the class Employee. The method should return
the value that is computed by subtracting the value of the attribute tax from the value of
the attribute salary. */



public double getNetSalary()
{
    return salary-tax;
}










}
