public abstract class BusinessEmployee extends Employee
{
    protected static final double baseSalary = 50000.00;
    protected double bonus;
    
    public BusinessEmployee(String name){
        super(name, baseSalary);
    }
    
    public double getBonusBudget(){
        return bonus;
    }
}
