package datamanagement;
public class StudentProxy implements IStudent {
private Integer I;
private String l;



    private String Il;
    private StudentManager lI;
    public StudentProxy( Integer id, String fn, String Il) {
        this.I = id; //Invoking the ID  
        this.l = fn; //invoking the first name 

        
        this.Il = Il; //invoking the last name
this.lI = StudentManager.get(); //invoking to get the last name
    }

    public Integer getID() { return I; 

    
    
}
public String getFirstName()
{ 
        return l; //returning a value
}

    public String getLastName() { 
return Il; //returns the integer
}
public void setFirstName(String firstName) {

    
    
    
    lI.getStudent(I).setFirstName(firstName);}
    public void setLastName(String lastName) {
        
        
        
        lI.getStudent(I).setLastName(lastName); //get the student details and set the last name
    }

    
    
        public void addUnitRecord(IStudentUnitRecord record) {
        lI.getStudent(I).addUnitRecord(record); //Add the student record
        }
        public IStudentUnitRecord getUnitRecord(String unitCode) {

            
 
            
            
            
            
            
                    return lI.getStudent(I).getUnitRecord(unitCode);//gets the unit record of student
        }


        
  
        
        
        
        
                                public StudentUnitRecordList getUnitRecords() { return lI.getStudent(I).getUnitRecords();//get the student unit record list
                                }}
