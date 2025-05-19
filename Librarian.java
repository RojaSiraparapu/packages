package com.library.staff;

public class Librarian
{
	private String librarianName;
	private int yearsOfExperience;
	
	public void setlibrarianName(String librarianName)
	{
		this.librarianName=librarianName;
	}
	public void setyearsOfExperience(int yearsOfExperience)
	{
		this.yearsOfExperience=yearsOfExperience;
	}
	
	public String getlibrarianName()
	{
		return librarianName;
	}
	public int getyearsOfExperience()
	{
		return yearsOfExperience;
	}
	
	public void showLibrarianDetails()
	{
		System.out.println("Librarian Name: "+librarianName);
		System.out.println("Year Of Experience: "+yearsOfExperience);
	}
}