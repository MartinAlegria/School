import java.util.*;

public class TechnicalLead extends TechnicalEmployee
{
    protected ArrayList<Employee> array;
    
    public TechnicalLead(String name){
        super(name);
        array = new ArrayList<Employee>();
    }
    
    public boolean hasHeadCount(){
        if(array.size()<4){
            return true;
        }
        return false;
    }
    
    public boolean addReport(SoftwareEngineer e){
        if(hasHeadCount()){
            array.add(e);
            return true;
        }
        return false;
    }
    
    public boolean approveCheckIn(SoftwareEngineer e){
        for(int i = 0; i < array.size(); i++){
            if(e.name.equals(array.get(i).name)){
                return e.getCodeAccess();
            }
        }
        return false;
    }
    
    /*public boolean requestBonus(Employee e, double bonus){
        
    }*/
    
    public String getTeamStatus(){
        String status = employeeStatus() + " and is managing: \n";
        
        if(array.size() == 0){
            status = status + "no hay empleados que le reportan todavía";
        }
        
        for(int i = 0; i < array.size(); i++){
            status = status + array.get(i).employeeStatus() + "\n";
        }
        
        return status;
    }
}
