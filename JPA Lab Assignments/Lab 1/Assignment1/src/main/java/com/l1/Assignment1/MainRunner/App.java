package com.l1.Assignment1.MainRunner;

import java.util.Scanner;

import com.Assignment1.service.AuthorServiceImpl;
import com.l1.Assignment1.model.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AuthorServiceImpl service = new AuthorServiceImpl();
    	Scanner sc = new Scanner(System.in);
    	String fName;
    	String mName;
    	String lName;
    	String pNo;
        while(true) {
        	System.out.println("Press 1 for Add Author");
        	System.out.println("Press 2 for Delete Author");
        	System.out.println("Press 3 for Update Author");
        	System.out.println("Press 4 for Get Author");
        	int c = sc.nextInt();
        	switch(c) {
        		case 1: System.out.println("Enter Author Details: - ");
        				System.out.println("Enter FirstName :-");
        				fName = sc.next();
        				System.out.println("Enter MiddleName :-");
        				mName = sc.next();
        				System.out.println("Enter LastName :-");
        				lName = sc.next();
        				System.out.println("Enter PhoneNumber :-");
        				pNo = sc.next();
        				Author author = new Author(fName,mName,lName,pNo);
        				Author aDetails = service.addAuthor(author);
        				System.out.println(aDetails);
        				break;
        		case 2:	System.out.println("Enter Author Id: - ");
						int id = sc.nextInt();
						Boolean status = service.deleteAuthor(id);
						if(status==true) {
							System.out.println("Author Deleted Successfully");
						}else {
							System.out.println("Author can't be deleted");
						}
						break;
        		case 3: System.out.println("Enter Author Id: - ");
						int id1 = sc.nextInt();
						Author author1 = service.getAuthor(id1);
						if(author1!=null) {
							System.out.println("Enter Author Details: - ");
	        				System.out.println("Enter FirstName :-");
	        				fName = sc.next();
	        				System.out.println("Enter MiddleName :-");
	        				mName = sc.next();
	        				System.out.println("Enter LastName :-");
	        				lName = sc.next();
	        				System.out.println("Enter PhoneNumber :-");
	        				pNo = sc.next();
	        				Author author2 = new Author(id1,fName,mName,lName,pNo);
	        				Boolean status2 = service.updateAuthor(author2); 
	        				if(status2==false) {
	        					System.out.println("Author can't be updated");
	        				}else {
	        					System.out.println("Author updated Successfully");
	        				}
						}else {
							System.out.println("Author can't be updated");
						}
						break;
        		case 4:	System.out.println("Enter Author Id: - ");
						int id3 = sc.nextInt();
						Author gAuthor= service.getAuthor(id3);
						if(gAuthor==null) {
        					System.out.println("Author doesn't exist");
        				}else {
        					System.out.println(gAuthor);
        				}
						break;
				default: System.out.println("Please choose a valid option");
						break;
        	}
        	
        }
    }
}
