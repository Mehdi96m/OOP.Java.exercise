public class PartTimeEmployee  extends Employee{


/*Create the class PartTimeEmployee that includes attributes: hours and rate with data
types: “double” and “double” respectively. */


private double hours;
private double rate;

/*pp) Include a constructor to the class PartTimeEmployee with parameters: id, name, age,
gender, designation, mobile, and rate. */
public PartTimeEmployee(int id,String name,int age,char gender,String designation,String mobile,double rate)
{
    super(id, name, age, gender, designation, mobile);
    this.rate = rate;

}
public void sethours(double hours){ this.hours = hours;}
public void setrate(double rate){ this.rate = rate;}
public double gethours(){return hours;}
public double getrate(){return rate;}



@Override
public String display()
{
    String output = "Hours of work : " + hours + "\n" + "Rate : " + rate + "\n";
    return super.display() + output;

}

/*Include a method called computeSalary to the class PartTimeEmployee to compute the
value of the attribute salary. The value of the attribute salary is computed by multiplying
the value of the attribute hours with the value of the attribute rate. */


public void computeSalary()
{
    super.setsalary(hours * rate);
}




}

