public abstract class Employee
{
    protected int id;
    protected String name;
    protected double baseSalary;
    protected Employee manager;
    private static int count;
    
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        count++;
        id=count;
    }
    
    abstract String employeeStatus();

    
    public void setManager(Employee manager){
        this.manager = manager;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public int getEmployeeID(){
        return id;
    }
    
    public Employee getManager(){
        return manager;
    }
    
    public boolean equals(Employee other){
        if(id == other.id)
            return true;
        else
            return false;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " ";
    }
    
}
