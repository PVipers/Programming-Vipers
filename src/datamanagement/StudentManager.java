package datamanagement;

import org.jdom.*;
import java.util.List;
public class StudentManager {
    private static StudentManager self = null;

    
    private StudentMap sm;
    private java.util.HashMap<String, StudentMap> um; //Hash mapping technique was used to store values
public static StudentManager get() {
        if (self == null) 
            
self = new StudentManager(); //new object self created
        return self; }
private StudentManager() {

    
            sm = new StudentMap(); //new object sm created
        um = new java.util.HashMap<>();} //hash map was used to store the um data
        public IStudent getStudent(Integer id) {
IStudent is = sm.get(id); //Takes the input 
    return is != null ? is : createStudent(id); 
    }

private Element getStudentElement(Integer id) {
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentTable").getChildren("student")) 
            if (id.toString().equals(el.getAttributeValue("sid"))) 
return el;
        return null;
                }
                private IStudent createStudent(Integer id) {
                    IStudent is;
        Element el = getStudentElement(id); //get the student id
        if (el != null) {
            StudentUnitRecordList rlist = StudentUnitRecordManager.instance().getRecordsByStudent(id); //get the student details and store in list
    is = new Student(new Integer(el.getAttributeValue("sid")),el.getAttributeValue("fname"),el.getAttributeValue("lname"),rlist); //get the student details of id,fname and lname 

    
    sm.put(is.getID(), is);
        return is; }
throw new RuntimeException("DBMD: createStudent : student not in file"); //Might show exception if the student is not found
                }
    private IStudent createStudentProxy(Integer id) {
        Element el = getStudentElement(id); //get the student data
        
        
        
        
        
        
        if (el != null) return new StudentProxy(id, el.getAttributeValue("fname"), el.getAttributeValue("lname"));
        throw new RuntimeException("DBMD: createStudent : student not in file");} //throws run time exception

        public StudentMap getStudentsByUnit(String uc) {
        StudentMap s = um.get(uc);
        if (s != null) 
{

    
    return s;
                }

s = new StudentMap(); //created new mapping list s
IStudent is;
    StudentUnitRecordList ur = StudentUnitRecordManager.instance().getRecordsByUnit(uc); //records student details
        for (IStudentUnitRecord S : ur) {
            
            
            
            
            
            
            
            
            
            is = createStudentProxy(new Integer(S.getStudentID())); //get the student ID
    s.put(is.getID(), is);}
    um.put( uc, s);
        return s;
}}
