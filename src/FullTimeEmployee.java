public class FullTimeEmployee extends Employee {

 /*ff) Create the class FullTimeEmployee that includes attributes: fund and fundRate with
data types: “double” and “double” respectively. */

private double fund;
private double fundRate;


/* Include a constructor to the class FullTimeEmployee with parameters: id, name, age,
gender, designation, mobile, and fundRate. The value of the attribute fund should be
initially zero for any full-time employee. */



public FullTimeEmployee(int id,String name ,int age,char gender,String designation,String mobile, double fundRate)
{
    super(id, name, age, gender, designation, mobile);
    this.fundRate = fundRate;
    this.fund = 0.0;
}

public void setfund(double fund){this.fund = fund;}
public void setfundRate(double fundRate){this.fundRate = fundRate;}
public double getfundrate(){return fundRate;}
public double getfund(){return fund;}



/*nclude a method called display to the class FullTimeEmployee to display the values of
attributes of the class. */

@Override
public String display()
{
    String output = "Fund = " + fund + "\n" + "Fundrate : " + fundRate + "\n";
    return super.display() + output;

}


/*Include a method called addToFund to the class FullTimeEmployee to add an amount
to the value of the attribute fund. The amount to be added is computed by multiplying the
value of the attribute salary with the value of the attribute fundRate. The value of the
attribute fund should be subtracted from the value of the attribute salary. */



public void addToFund()
{
     double amounttoadd = getsalary() * fundRate / 100.0;
    fund += amounttoadd;
    setsalary(getsalary() - amounttoadd);
}




}


