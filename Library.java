package com.library.books;

public class Library
{
	private String libraryName;
	private int totalBooks;
	
	public void setlibraryName(String libraryName)
	{
		this.libraryName=libraryName;
	}
	public void settotalBooks(int totalBooks)
	{
		this.totalBooks=totalBooks;
	}
	
	public String getlibraryName()
	{
		return libraryName;
	}
	public int gettotalBooks()
	{
		return totalBooks;
	}
	
	public void showLibraryDetails()
	{
		System.out.println("Library Name: "+libraryName);
		System.out.println("Total Books: "+totalBooks);
	}
}