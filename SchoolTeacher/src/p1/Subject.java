package p1;

public class Subject {

	private int subjectId;
	private String subjectName;

	public Subject() {
	}

	public Subject(String name) {
		this.subjectName = name;
	}

	public Subject(String name, int id) {
		this.subjectId = id;
		this.subjectName = name;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
