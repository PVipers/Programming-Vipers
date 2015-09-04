package datamanagement;
public class StudentUnitRecordProxy implements IStudentUnitRecord {
private Integer studentID;
private String unitCode;
private StudentUnitRecordManager mngr;
public StudentUnitRecordProxy( Integer id, String code ) 
{
this.studentID = id;this.unitCode = code; //invokes id
this.mngr = StudentUnitRecordManager.instance();}
public Integer getStudentID() { 
    return studentID; //returns student id of its value
}
public String getUnitCode() { return unitCode; 
}
public void setAsg1(float mark) {
mngr.getStudentUnitRecord( studentID, unitCode ).setAsg1(mark);//set the student unit record with its id and unit code for asig 1 with marks
}
public float getAsg1() 
{
return mngr.getStudentUnitRecord( studentID, unitCode ).getAsg1();}//get the student unit record with its id and unit code for asig 1 with marks
public void setAsg2(float mark) { mngr.getStudentUnitRecord( studentID, unitCode ).setAsg2(mark);} //set the asg 2
public float getAsg2() {return mngr.getStudentUnitRecord( studentID, unitCode ).getAsg2(); //get assg 2
}
public void setExam(float mark) {mngr.getStudentUnitRecord( studentID, unitCode ).setExam(mark);//set exam
}
public float getExam() 
{
return mngr.getStudentUnitRecord( studentID, unitCode ).getExam();//return the get student uni
}
public float getTotal() {return mngr.getStudentUnitRecord( studentID, unitCode ).getTotal(); //return the id and unitcode
}}
