package com.company;

import java.util.List;

public class Boss {
	
	private int wd;
	private String name;
	private String dg;
	
	private List<Work> work;

	public int getWd() {
		return wd;
	}

	public void setWd(int wd) {
		this.wd = wd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDg() {
		return dg;
	}

	public void setDg(String dg) {
		this.dg = dg;
	}

	public List<Work> getWork() {
		return work;
	}

	public void setWork(List<Work> work) {
		this.work = work;
	}

	public Boss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boss(int wd, String name, String dg, List<Work> work) {
		super();
		this.wd = wd;
		this.name = name;
		this.dg = dg;
		this.work = work;
	}
	
	
}
