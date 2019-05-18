/*Student number = C1735331
 * Student nmae = Philippe de L'Etanche
 */
package obj_orientated;

//we call this function like this Validation.nameValid(name)
public class validaiton {
	public static int nameValid(String student_name){								//validation for name input
		if( student_name instanceof String  && student_name.length() >= 1 ) 		//checking if the name variable is a string and bigger than 1(length)
			return 1;
		else 
			return 0;
		
		
	}

	public static int studentNO(String student_id){					   					//validation for Student ID
		char first_c = student_id.charAt(0);
		int first_c_ascii = (int)first_c;
		if( first_c_ascii == 67 && student_id.length() == 8 ) { 			//checking the first letter and the length of the string
			for(int i = 2;i < student_id.length()-1;++i ) {								//checking that the rest of the characters are numbers
				int converted = Integer.parseInt(student_id.substring(i-1,i));
				if( converted != (int)converted ) 										//checking if the  converted value is an integer between 0-9	
					return 0;
			}
		}else 
			return 0;
		return 1;
	}

	public static int courseNameValid(String course_name){						//validation for Course Name
		if( ( course_name instanceof String ) && course_name.length() >= 1 )	//checking if the name is a string and bigger than 1(length)
			return 1;
		else 
			return 0;
		

	}
	

	public static int courseIdValid(String course_id){						//validation for Course ID
		if( course_id.length() == 6 ) { 									//Checking if the length is equal to 6                                  
			char first_c = course_id.charAt(0);
			int first_c_ascii = (int)first_c;
			char second_c = course_id.charAt(1);
			int second_c_ascii = (int)second_c;
			if( (first_c_ascii >= 65 && first_c_ascii <=90) && (second_c_ascii >= 65 && second_c_ascii <= 90)  ) 	//checking if the first two letters are upper case
				for(int i = 3;i < course_id.length() - 1;i++) {														//checking each character after the 2 letters                   
					int convert=Integer.parseInt(course_id.substring(i-1,i));										//if they are integers validation is correct
					if( (int)convert != convert ) 																	//if and characters after the two letters are string, the validation will return false
						return 0;
				}
			else 
				return 0;
		}else 
			return 0;

		return 1;
	}

	

	public static int houseNO(String house_no){							//validation for house number
		if(house_no.length() == 1) {
			int convert_house = Integer.parseInt(house_no);
			if((int)convert_house == convert_house)
				return 1;
			return 0;
		}else if(house_no.length() == 2) {
			int convert_house = Integer.parseInt(house_no.substring(0,1));
			int convert_houses = Integer.parseInt(house_no.substring(1,2));
			if((int)convert_house == convert_house && ((int)convert_houses == convert_houses || (house_no.substring(1,2) instanceof String)))
					return 1;
			return 0;
		}else if(house_no.length() >= 3) {
			int convert = Integer.parseInt(house_no.substring(0,1)); 		//checking if the the first character is an integer
			if(convert == (int)convert) {	 								//we check if the first character is an integer
				int y = house_no.length();
				int convertt = Integer.parseInt(house_no.substring(y-3,y-2));
				int converts = Integer.parseInt(house_no.substring(y-2,y-1));
				if( (convertt == (int)convertt && ( house_no.substring(y-2,y-1) instanceof String )) || (converts == (int)converts) ) //we check if the last character is an int or a string         
					return 1;		
				else 
					return 0;
			}else 
				return 0;
		}
		return 0;
	}

	public static int streetValid(String street_name) {					//validation for street input								
		if(street_name instanceof String && street_name.length() >= 1) 	//checking if the street variable is a string and bigger than 1(length
				return 1;
		return 0;
		
	}

	public static int townValid(String town){					//validation for town input
		if( town instanceof String  && town.length() >= 1 ) {	//checking if the town variable is a string and bigger than 1(length)
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int postValid(String post_code){ 					//validation for post code input
		if( post_code.length() == 5 ) { 							//checking the length
			char first_c = post_code.charAt(0);
			int first_c_ascii = (int)first_c;
			char second_c = post_code.charAt(1);
			int second_c_ascii = (int)second_c;
			if( (first_c_ascii >= 65 && first_c_ascii <=90) && (second_c_ascii >= 65 && second_c_ascii <= 90) ) { 	//checking if the first two letters are upper case
				int convert = Integer.parseInt(post_code.substring(2, 3));
				if( convert == (int)convert) { 						//checking the 3rd element to see if it is an integer
					char third_c = post_code.charAt(3);
					int third_c_ascii = (int)third_c;
					char fourth_c = post_code.charAt(4);
					int fourth_c_ascii = (int)fourth_c; 
					if( (third_c_ascii >= 65 && third_c_ascii <=90) && (fourth_c_ascii >= 65 && fourth_c_ascii <= 90) ) //checking the last two letters are upper case
						return 1;
					else 
						return 0;
					
				}else 
					return 0;
				
			}else 
				return 0;
			
		}else 
			return 0;
		

	}
}


