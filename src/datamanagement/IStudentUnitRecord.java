package datamanagement;

public interface IStudentUnitRecord {

    public Integer getStudentID(); //Takes Input of data
    public String getUnitCode(); ////Takes Input of the data

    public void setAsg1(float mark); //Takes Input of data
    public float getAsg1();//Gives ouput of the data

    public void setAsg2(float mark);//Takes Input of data
    public float getAsg2();//Gives ouput of the data

    public void setExam(float mark);//Takes Input of data
    public float getExam();//Gives ouput of the data

    public float getTotal();//Gives ouput of the data
}
