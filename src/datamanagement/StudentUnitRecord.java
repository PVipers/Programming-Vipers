package datamanagement;

public class StudentUnitRecord implements IStudentUnitRecord {
//Implementing the features of student unitrecord to Istudentunitrecord	
    private Integer sid;
	private String uc;
	private float a1, a2, ex;

	public StudentUnitRecord(Integer id, String code, float asg1, float asg2,
			float exam) {
		this.sid = id; //invoking the id
		this.uc = code; //invoking the code
		this.setAsg1(asg1);//invoking the asg1
		this.setAsg2(asg2);//invoking the asg2
		this.setExam(exam);//invoking the exam
	}

	public Integer getStudentID() {
		return sid; //returning ths student id
	}

	public String getUnitCode() {
		return uc; //returning the unit code
	}

	public void setAsg1(float a1) {
		if (a1 < 0 ||
			a1 > UnitManager.UM().getUnit(uc).getAsg1Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight"); //exception for runtime
		}
		this.a1 = a1;
	}

	public float getAsg1() {

		return a1; //returns a1 value
	}

	public void setAsg2(float a2) {
		if (a2 < 0 ||
			a2 > UnitManager.UM().getUnit(uc).getAsg2Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");//exception for runtime
		}
		this.a2 = a2; //returns a2 value

	}

	public float getAsg2() {
		return a2;//return a2
	}

	public void setExam(float ex) {
		if (ex < 0 ||
				ex > UnitManager.UM().getUnit(uc).getExamWeight()) {
				throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");//runtime xception
			}
		this.ex = ex;//invoking the ex
	}

	public float getExam() {
		return ex; //returns ex value
	}

	public float getTotal() {
		return a1 + a2 + ex; //returns the value by adding a1,a2 and ex

	}
}
