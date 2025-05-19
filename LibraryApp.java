package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp
{
	public static void main(String args[])
	{
		Library library=new Library();
		library.setlibraryName("Book Haven");
		library.settotalBooks(5500);
		
		Librarian librarian=new Librarian();
		librarian.setlibrarianName("Rose");
		librarian.setyearsOfExperience(3);

		library.showLibraryDetails();
		System.out.println();
		librarian.showLibrarianDetails();	
	}
}