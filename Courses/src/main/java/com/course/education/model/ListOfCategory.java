package com.course.education.model;

public class ListOfCategory {

	private MutualFunds mutualFunds;
	private Computers computers;
	public ListOfCategory(MutualFunds mutualFunds, Computers computers) {
		super();
		this.mutualFunds = mutualFunds;
		this.computers = computers;
	}
	public ListOfCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MutualFunds getMutualFunds() {
		return mutualFunds;
	}
	public void setMutualFunds(MutualFunds mutualFunds) {
		this.mutualFunds = mutualFunds;
	}
	public Computers getComputers() {
		return computers;
	}
	public void setComputers(Computers computers) {
		this.computers = computers;
	}
	@Override
	public String toString() {
		return "ListOfCategory [mutualFunds=" + mutualFunds + ", computers=" + computers + "]";
	}
	
}
