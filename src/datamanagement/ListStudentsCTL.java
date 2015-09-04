package datamanagement;
        public class ListStudentsCTL {
private StudentManager sm; //declared as private variable
public ListStudentsCTL() {
    sm = StudentManager.get(); //Get the data 
}
            public void listStudents( IStudentLister lister, String unitCode ) {
    lister.clearStudents();
                StudentMap students = sm.getStudentsByUnit( unitCode );//Maps the student by taking details
for (Integer id : students.keySet() ) lister.addStudent(students.get(id));}} //add the student details
