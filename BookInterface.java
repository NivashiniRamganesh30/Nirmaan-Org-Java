package day21;

import java.util.ArrayList;
import java.util.Scanner;


public class BookInterface {
	public static void main(String[] args) {                                                                                             
		Book book = new Book();
		ArrayList<Book> al = new  ArrayList<Book>();
		Scanner na = new Scanner(System.in);
		
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("Enter your choice");
			System.out.println("1 for Add");
			System.out.println("2 for Get");
			System.out.println("3 for Update");
			System.out.println("4 for Remove");
			System.out.println("0 for exit");
			int key = na.nextInt();
			na.nextLine();
			
			if(key==1) {
				System.out.println("Enter the ID :");
				int id=na.nextInt();
				
				System.out.println("Enter the Title :");
				String title=na.next();   
				
				System.out.println("Enter the Price :");
				double price=na.nextDouble();
				
				System.out.println("Enter the Number Of Copies :");
				int copies=na.nextInt();
				
				al.add(book = new Book(id, title, price, copies));
			}
			
			else if (key==2){
				System.out.println(al);
				}
			
			else if(key==3) {
				System.out.println("Enter the your ID");
				int id =na.nextInt();
				na.nextLine();
				boolean isthere=false;
				for(Book book1 : al) {
					if(id==book1.getId()) {
						isthere=true;
						System.out.println("Rename your title");
						String title=na.nextLine();
						book1.setTitle(title);
						System.out.println("Re-enter the price");
						double price=na.nextDouble();
						book1.setPrice(price);
						System.out.println("Re-enter the NoOfCopies");
						int copies=na.nextInt();
						book1.setCopies(copies);
					}
				}
				if(!isthere) {
					System.out.println("Book not there");
				}
						
						}
					else if(key==4) {
						System.out.println("Enter book name");
						String title= na.nextLine();
						for(Book book2 : al) {
							if(title.equalsIgnoreCase(book2.getTitle())) {
								al.remove(book2);
								break;
							}
						}
					}
							else if(key==0) {
								isTrue=false;
								System.out.println("The End");
								break;
								
							}
	}
		na.close();
	}
	}
		
    
	
    


