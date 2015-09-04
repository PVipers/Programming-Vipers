package datamanagement;

public interface IUnit {

    public String getUnitCode();//Gives ouput of the data
    public String getUnitName();//Gives ouput of the data

    public float getPsCutoff();//Gives ouput of the data
    public void  setPsCutoff1(float cutoff);//Takes Input of the data

    public float getCrCutoff();//Gives ouput of the data
    public void  setCrCutoff(float cutoff);;//Takes Input of the data

    public float getDiCuttoff();  //Gives ouput of the data  
    public void  setDiCutoff(float cutoff);;//Takes Input of the data

    public float getHdCutoff();//Gives ouput of the data
    public void  setHdCutoff(float cutoff); ;//Takes Input of the data

    public float getAeCutoff();    //Gives ouput of the data
    public void  setAeCutoff(float cutoff); ;//Takes Input of the data
    
    public int getAsg1Weight();//Gives ouput of the data
    public int getAsg2Weight();//Gives ouput of the data
    public int getExamWeight();//Gives ouput of the data
    public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt); //Gives average of the total assignment

    public String getGrade(float asg1, float asg2, float exam); //Gives ouput of the grade

    public void addStudentRecord(IStudentUnitRecord record ); //Adds student record
    public IStudentUnitRecord getStudentRecord(int studentID ); //Gives the student record
    
    public StudentUnitRecordList listStudentRecords(); //Gives list of records of student
}
