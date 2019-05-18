/*Student number = C1735331
 * Student nmae = Philippe de L'Etanche
 */
package obj_orientated;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

//FileOutputStream saveFile = new FileOutputStream("saveFile.txt");		//to open file to save in
//ObjectOutputStream save = ObjectOutputStream(saveFile);					//this is to write in the file




/* A Java program that demonstrates console based input and output. */
public class first {
    // Program execution starts here
    public static void main ( String [] args ) throws IOException{// i think you can put String args[] as well
        Scanner user_input = new Scanner(System.in);
        String name = "";
        String id = "";
        String course_name = "";
        String course_id = "";
        String house = "";
        String street = "";
        String town = "";
        String post_code = "";
        String F_name = "";
        String loop_y_n = "y";
        String new_file_name = "";
        int okk = 0;
        int ok = 0;
        int q = 0;
        int words_int = 0;
        int j = 0;
        String str2 = "Record";
        //next lines are for input of a string
        // int x =Integer.parserInt(variable);
        //use this method to convert string to int, only if string is actually int
        
        while(loop_y_n.equals("y")){
        	System.out.println("Type 1 to add new record.");
        	System.out.println("Type 2 to show all entries.");
        	System.out.println("Type 3 to search by course name.");
        	System.out.println("Type 4 to search by substring.");
        	System.out.println("Type 5 to create a new file.");
        	System.out.println("Type 6 to display a specified subset of entries.");
        	System.out.println("Type 7 to delete entry:");
        	System.out.println("Type your choice: ");
        	String user_choice = user_input.nextLine();
        
	        //int convert_choice = Integer.parseInt(user_choice);
	        if (user_choice.equals("1")){						//checking for the user choice so we know on what brench to work next
	
	            int valid = 0;
	            //checking the validation for each input
	            //next lines are for input of a string/integer
	            //name
	            while(valid == 0){
	                name = Input.getToken("Enter your name: ");
	                if(validaiton.nameValid(name) == 1){
	                    valid = 1;
	                }else
	                	System.out.print("Only letters/spaces allowed, at least one character!");
	                	
	            }
	            //student id
	            valid = 0;
	            while(valid == 0) {
	                id = Input.getToken("Enter your student number: ");
	                if(validaiton.studentNO(id) == 1) {
	                	valid = 1;
	                }
	                else
	                	System.out.println("Your id should have capital c and 6 more digis!");
	            }
	            //course name
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your course name: ");
	            	course_name = user_input.nextLine();
	                if(validaiton.courseNameValid(course_name) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("Only letters/spaces allowed, at least one character!");
	            }
	            //course id
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your course id: ");
	            	course_id = user_input.nextLine();
	                if(validaiton.courseIdValid(course_id) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("2 upper case letters followed by 4 digits!"); 
	            }
	            //house number
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your house number: ");
	            	house = user_input.nextLine();
	                if(validaiton.houseNO(house) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("At least one digit followed by at most one letter!"); 
	            }
	            //street
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your street name: ");
	            	street = user_input.nextLine();
	                if(validaiton.streetValid(street) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("Only letters/spaces allowed, at least one character!");
	            }
	            //town
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your town name: ");
	            	town = user_input.nextLine();
	                if(validaiton.townValid(town) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("Only letters/spaces allowed, at least one character!");
	            }
	            //post code
	            valid = 0;
	            while(valid == 0) {
	            	System.out.print("Enter your post code: ");
	            	post_code = user_input.nextLine();
	                if(validaiton.postValid(post_code) == 1) {
	                	valid = 1;
	                }else
	                	System.out.print("2 upper case letters followed by 1 digit followed by 2 upper case letters !");
	            }
	            if(validaiton.nameValid(name) == 1 && validaiton.studentNO(id) == 1)
	                if(validaiton.courseNameValid(course_name) == 1 && validaiton.courseIdValid(course_id) == 1)
	                    if(validaiton.houseNO(house) == 1 && validaiton.streetValid(street) == 1)
	                        if(validaiton.townValid(town) == 1 && validaiton.postValid(post_code) == 1){
	                        	try(FileWriter fw = new FileWriter("save-file.txt", true);
	                            		BufferedWriter bw =new BufferedWriter(fw);
	                            		PrintWriter out = new PrintWriter(bw)) {
	                        			ok = ok + 1;
	                        			out.println("Entry: " + ok);
	                            		out.println("Name: " + name);
	                            		out.println("Student Number: " + id);
	                            		out.println("Course name: " + course_name);
	                            		out.println("Course id: " + course_id);
	                            		out.println("House: " + house);
	                            		out.println("Street: " + street);
	                            		out.println("Town: " + town);
	                            		out.println("Post code: " + post_code);
	                            		out.println("");
	                            		
	                            	
	                            }//catch (IOException z);
	
	                        }
	        }else if(user_choice.equals("2")){						//display  all entries
	        	BufferedReader in = new BufferedReader(new FileReader("save-file.txt"));	
	        	String line = null;
	        	while ((line = in.readLine()) != null) {
	        		System.out.println(line);
	        	}
	        	
	        }else if(user_choice.equals("3")) {						//search 
	        	String search_word = Input.getToken("Enter the string to search in the file:");		
	        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
	        	int line_counter = 0;
	        	while(reader.readLine() != null)
	        		line_counter ++;					//variable for the number of lines in the file
	        	reader.close();
	        	for(int i = 0; i < line_counter; i++) {
	        		try {
	        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
	        			if(line.indexOf(search_word) != -1) {
	                         
	        				for(j = 0; j < 8; j++) {
	        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j-2);
	        					System.out.println(lines);
	        				}
	        				System.out.println("");
	        			}
	        		}
	        			catch(IOException E) {
	        				E.printStackTrace();
	        			}
	        			
	        	}
	        		
	        	
	        	
	        }else if(user_choice.equals("4")) {				//search the file by a subset
	        	String search_option = Input.getToken("Enter the data field in witch you want to search(house/street/town/post-code):");
	        	if (search_option.equals("house")) {		//searching in the house field
	        		String search_word = Input.getToken("Enter the house number:");
		        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
		        	int line_counter = 0;
		        	while(reader.readLine() != null)
		        		line_counter ++;
		        	reader.close();
		        	int counter_smtg = 0;
		        	for(int i = 0; i < line_counter; i++) {
		        		try {
		        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
		        			if(line.indexOf(search_word) != -1) {
		                        if(line.startsWith("House") == true)
		                        	for(j = 0; j < 9; j++) {
		        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j-5);
		        					System.out.println(lines);
		        				}
		        				System.out.println("");
		        			}
		        		}
		        			catch(IOException E) {
		        				E.printStackTrace();
		        			}
		        			
		        	}
	        	}else if (search_option.equals("street")) {				//searcing in the street field
	        		String search_word = Input.getToken("Enter the street name:");	
		        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
		        	int line_counter = 0;				//variable to count the lines
		        	while(reader.readLine() != null)
		        		line_counter ++;
		        	reader.close();
		        	int counter_smtg = 0;
		        	for(int i = 0; i < line_counter; i++) {
		        		try {
		        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
		        			if(line.indexOf(search_word) != -1) {
		                        if(line.startsWith("Street") == true)
		                        	for(j = 0; j < 10; j++) {
		        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j-6);
		        					System.out.println(lines);
		        				}
		        				System.out.println("");
		        			}
		        		}
		        			catch(IOException E) {
		        				E.printStackTrace();
		        			}
		        			
		        	}
	        	}else if (search_option.equals("town")) {		//seaching in the town field
	        		String search_word = Input.getToken("Enter the town name:");
		        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
		        	int line_counter = 0;
		        	while(reader.readLine() != null)
		        		line_counter ++;
		        	reader.close();
		        	for(int i = 0; i < line_counter; i++) {
		        		try {
		        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
		        			if(line.indexOf(search_word) != -1) {
		                        if(line.startsWith("Town") == true)
		                        	for(j = 0; j < 9; j++) {
			        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j-7);
			        					System.out.println(lines);
		        				}
		        				System.out.println("");
		        			}
		        		}
		        			catch(IOException E) {
		        				E.printStackTrace();
		        			}
		        			
		        	}
	        		
	        	}else if (search_option.equals("post-code")) {			//searching in the post code field
	        		String search_word = Input.getToken("Enter the post code:");
		        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
		        	int line_counter = 0;
		        	while(reader.readLine() != null)
		        		line_counter ++;
		        	reader.close();
		        	for(int i = 0; i < line_counter; i++) {
		        		try {
		        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
		        			if(line.indexOf(search_word) != -1) {
		                        if(line.startsWith("Post code") == true)
		                        	for(j = 0; j < 10; j++) {
		        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j-8);
		        					System.out.println(lines);
		        				}
		        				System.out.println("");
		        			}
		        		}
		        			catch(IOException E) {
		        				E.printStackTrace();
		        			}
		        			
		        	}
	        	}
	        }else if(user_choice.equals("5")) {				//creating a new txt file
	        	new_file_name = Input.getToken("Enter the name of the file:");
	        	File file = new File(new_file_name + ".txt");
	        	  
	        	//Create the file
	        	if (file.createNewFile()){
	        	System.out.println("File is created!");
	        	}else{
	        	System.out.println("File already exists.");
	        	}
	        }else if(user_choice.equals("6")) {
        		String search_word = Input.getToken("Enter entries you want to display( 2 / 1-3 ):");
        		if(search_word.length() == 1) {
		        	BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
		        	int line_counter = 0;
		        	while(reader.readLine() != null)
		        		line_counter ++;
		        	reader.close();
		        	for(int i = 0; i < line_counter; i++) {
		        		try {
		        			String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
		        			if(line.indexOf(search_word) != -1) {
		                        if(line.startsWith("Entry") == true)
		                        	for(j = 0; j < 8; j++) {
		        					String lines = Files.readAllLines(Paths.get("save-file.txt")).get(i+j);
		        					System.out.println(lines);
		        				}
		        				System.out.println("");
		        			}
		        		}
		        			catch(IOException E) {
		        				E.printStackTrace();
		        			}
		        			
		        	}
        		}else if(search_word.length() > 1) {
        			   
        			   String first = search_word.substring(0,1);
        			   String last = search_word.substring(2,3);
        			   
        			   int first_int = Integer.parseInt(first);
        			   int last_int = Integer.parseInt(last);
        					   
        			   BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
        			   int line_counter = 0;
        			   while (reader.readLine() != null) 			//variable for counting lines
        				   line_counter++;
        			   reader.close();   
        			   
        			   int limit = 0;				//limit is to skip information
        				 for(int i = 0; i < line_counter; i++){
        					 String line = Files.readAllLines(Paths.get("save-file.txt")).get(i);
        					 String[] words = line.split(" ");				//spliting the line so we can acces each element from the line
        					 int len = words.length;						//variable for the length of words
	        				 for(j = first_int; j <= last_int; j++){
	        					 String string_number = Integer.toString(j);	        					 
	        					 if(line.trim().isEmpty() ) {				//checking if the line is empty
	        				}else if(words[len-1].equals(string_number)){
	        					 limit = i;
	        					 for(int p =0; p < 8; p++){
	        						 String linez = Files.readAllLines(Paths.get("save-file.txt")).get(i+p);
	        						 System.out.println(linez);
	        					 }
	        					 System.out.println(" ");
	        				  } 
	        				 }
        				}
	        	}
        	}else if(user_choice.equals("7")) {
	       		 BufferedReader reader = new BufferedReader(new FileReader("save-file.txt"));
	       		 int line_counter = 0;
	       		 while (reader.readLine() != null)
	       			 line_counter++;
	       		 reader.close();
	       		 
	       		 String e = Input.getToken("Enter entry number");
	       	     
	       		 int limit = 0;
	       		 for(int ii = 0; ii < line_counter; ii++){
		       		 String line = Files.readAllLines(Paths.get("save-file.txt")).get(ii);
		       		 String[] words = line.split(" ");
		       		 int len = words.length;
		       		 if(line.trim().isEmpty() ) {
		       		}else if(words[len-1].equals(e)){
		       			 limit = ii;
		       		  } 
	       		 }
	       		 
	       		 for(int pp = 0; pp <limit-1; pp++){
	       			 String line = Files.readAllLines(Paths.get("save-file.txt")).get(pp);
	       			 try(FileWriter fw = new FileWriter("save-file-new.txt", true); 
	       		        	   BufferedWriter bw = new BufferedWriter(fw);
	       		        	   PrintWriter out = new PrintWriter(bw)){
	       		        	   out.println(line);
	       		        	   
	       		           }catch (IOException z){
	       		        	   
	       		      }
	       			 System.out.println(line);
	       		 }
	       		 for(int jj = limit + 9 ; jj < line_counter; jj++){
	       			 String line = Files.readAllLines(Paths.get("save-file.txt")).get(jj);
	       			 try(FileWriter fw = new FileWriter("save-file-new.txt", true); 
	       		        	   BufferedWriter bw = new BufferedWriter(fw);
	       		        	   PrintWriter out = new PrintWriter(bw)){
	       		        	   out.println(line);
	       		        	   //out.println("more text");
	       		        	   
	       		           }catch (IOException z){
	       		        	   
	       		      }
	       			 System.out.println(line);
	       		 }
        	}	        
	        loop_y_n = Input.getToken("Do you want to return to menu y/n: ");		//variable to check if user wants to go back to menu
        }

    } // end main method
    public static class Input {	//function for user input
    	// Prompted input of an word/token
    	public static String getToken( String prompt ) {
    	Scanner in = new Scanner(System.in);
    	System.out.print( prompt );
    	String result = in.next();
    	return result;
    	}
    }
} // end first class





