package datamanagement;

public interface IStudent {

    public Integer getID(); //Takes Input of data

    public String getFirstName(); //Takes Input of data
    public void setFirstName(String firstName); //Gives output of the data

    public String getLastName();//Takes Input of data
    public void setLastName(String lastName);//Gives output of the data

    public void addUnitRecord( IStudentUnitRecord record ); //Adding the new record
    public IStudentUnitRecord getUnitRecord( String unitCode );   //Takes Input of data


    public StudentUnitRecordList getUnitRecords();//Takes Input of data

}
