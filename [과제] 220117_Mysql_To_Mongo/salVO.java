

public class salVO {
	
	private int grade;
	private String losal;
	private int hisal;
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getLosal() {
		return losal;
	}
	public void setLosal(String losal) {
		this.losal = losal;
	}
	public int getHisal() {
		return hisal;
	}
	public void setHisal(int hisal) {
		this.hisal = hisal;
	}
	
	@Override
	public String toString() {
		return "salVO [grade=" + grade + ", losal=" + losal + ", hisal=" +hisal + "]";
	}
	
}
