package com.bfmz.entity;

//学生类
public class Qiye {
	private int eId;
	private String eNo;//学号
	private String password;//密码
	private String eName;//姓名
	private String einfo;//性别
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteNo() {
		return eNo;
	}
	public void seteNo(String eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteinfo() {
		return einfo;
	}
	public void seteinfo(String einfo) {
		this.einfo = einfo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "Qiye [eId=" + eId + ", eNo=" + eNo + ", password=" + password + ", eName="
				+ eName + ", einfo=" + einfo + "]";
	}
	
}
