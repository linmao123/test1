package fanShe;

import java.util.Date;

public class Student {
	private int sid;
	private String name;
	private String sex;
	private Date brithday;
	public Student(int sid, String name, String sex, Date brithday) {
		super();
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.brithday = brithday;
	}
	public Student() {
		super();
	}
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sex=" + sex
				+ ", brithday=" + brithday + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	
}
