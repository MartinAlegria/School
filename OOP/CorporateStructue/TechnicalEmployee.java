public abstract class TechnicalEmployee extends Employee
{
    protected double salary;
    protected int checkins;
    
    public TechnicalEmployee(String name){
        super(name, 75000.00);
        salary = 75000.00;
    }
    
    @Override
    public String employeeStatus(){
        return super.toString() + " has " + checkins + " successful check ins";
    }
}
