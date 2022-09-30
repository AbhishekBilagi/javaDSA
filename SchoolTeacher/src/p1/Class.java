package p1;

public class Class {
	private int classId;
	private String className;

	public Class() {
		super();
	}

	public Class(String name) {
		this.className = name;
	}

	public Class(String name, int id) {
		this.classId = id;
		this.className = name;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}