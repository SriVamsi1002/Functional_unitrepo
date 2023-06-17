package com.spring.model;

public class FunitModel {
	private int modl_id;
	private int fun_id;

	public FunitModel(int modl_id, int fun_id) {
		super();
		this.modl_id = modl_id;
		this.fun_id = fun_id;
	}

	public FunitModel() {
		// TODO Auto-generated constructor stub
	}

	public int getModl_id() {
		return modl_id;
	}

	public void setModl_id(int modl_id) {
		this.modl_id = modl_id;
	}

	public int getFun_id() {
		return fun_id;
	}

	public void setFun_id(int fun_id) {
		this.fun_id = fun_id;
	}

	@Override
	public String toString() {
		System.out.println("FunitModel [modl_id=" + modl_id + ", fun_id=" + fun_id + "]");
		return "FunitModel [modl_id=" + modl_id + ", fun_id=" + fun_id + "]";

	}

}
