public class SoftwareEngineer extends TechnicalEmployee
{
    protected boolean access;
    
    public SoftwareEngineer(String name){
        super(name);
        checkins = 0;
    }
    
    public boolean getCodeAccess(){
        return access;
    }
    
    public void setCodeAccess(boolean access){
        this.access = access;
    }
    
    public int getSuccessfulCheckIns(){
        return checkins;
    }
    
    public boolean checkInCode(){
        if(((TechnicalLead)this.getManager()).approveCheckIn(this))
            return true;
        this.setCodeAccess(false);
        return false;
    }
}
