package com.aj.entity;

public class Player {
	private int jersy_no;
	private String pname;
	private int runs;
	private int wickets;
	private String tname;
	
	
	public Player() {
		super();
		
	}

	public Player(int jersy_no, String pname, int runs, int wickets, String tname) {
		super();
		this.jersy_no = jersy_no;
		this.pname = pname;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}

	public int getJersy_no() {
		return jersy_no;
	}

	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Player [jersy_no=" + jersy_no + ", pname=" + pname + ", runs=" + runs + ", wickets=" + wickets
				+ ", tname=" + tname + "]";
	}
	
	
	

}
