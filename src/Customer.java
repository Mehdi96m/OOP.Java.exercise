
public class Customer extends Person {

/*Create the class Customer that includes attributes: level, amount1, amount2, and profit
with data types: “int”, “double”, “double”, and “double” respectively. */

private int level;
private double amount1;
private double amount2;
private double profit;



public Customer (int id,String name ,int age,char gender ,int level)
{
    super(id,name,age,gender);
    this.level = level;
}
        

public void setAmount1(double amount1) {
    this.amount1 = amount1;
}
public void setAmount2(double amount2) {
    this.amount2 = amount2;
}
public void setLevel(int level) {
    this.level = level;
}
public void setProfit(double profit) {
    this.profit = profit;
}



public double getAmount1() {
    return amount1;
}
public double getAmount2() {
    return amount2;
}
public int getLevel() {
    return level;
}
public double getProfit() {
    return profit;
}



/*Consider the class Customer. The value of the attribute profit is computed by
subtracting the value of the attribute amount1 from the value of the attribute amount2.
Include a method called calculateProfit to the class to calculate the value of the attribute
profit. */



public void calculateProfit() { profit = amount2-amount1;}





/*Include a method called buyItems to the class Customer with parameters: price1,
price2, and n. The new value of the attribute amount1 is computed by multiplying the
value of the attribute price1 with the value of the attribute n and adding the value of the
attribute amount1. The value of the attribute amount2 is computed by multiplying the
value of the attribute price2 with the value of the attribute n and adding the value of the
attribute amount2. Include these computations to the body of the method. */




public void buyItems(double price1,double price2,double n)
{
    amount1 += price1 * n;
    amount2 += price2 * n;
}




/*Include a method called reduceProfit to the class Customer that computes the value of
reduction. The value of reduction is computed by multiplying the value of attribute profit
from the value of t. The value of t is based on the value of the attribute level as given in
the table below. Furthermore, the value of reduction should be subtracted from the value
of attribute profit. */

public void reduceProfit( )
{
    double t  = 0.00;
    if(level == 1){
        t = 0.03;
    }else if (level == 2) {
        t = 0.05;
    }else if (level == 3) {
        t = 0.08;
    }else if (level == 4 ) {
        t = 0.12;
    }

    

    if (profit > 0) {
        double reduction = profit * t;
        profit -= reduction;
    }



}

@Override
public  String  display()
{

return super.display()  + "Profit = " + profit + "\n" + "Level = " + level +  "\n\n";
}



















}
