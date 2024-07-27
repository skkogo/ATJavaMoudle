package com.oops3;

public class ProblemsPOJO {
	private int id;
  private String  remark;
public ProblemsPOJO(int id, String remark) {
	super();
	this.id = id;
	this.remark = remark;
}
@Override
public String toString() {
	return "ProblemsPOJO [id=" + id + ", remark=" + remark + "]";
}

}
