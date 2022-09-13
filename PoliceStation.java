class PoliceStation
{
	
	// This method will print only pincode
	void Area(int pincode)
      {
		System.out.println(pincode);
	}
	
	// This method will print pincode and police station
	void Area(int pincode, String police_s) 
      {
		System.out.println(pincode);
		System.out.println(police_s);
	}
	
	// This method will print pincode, police station and city
	void Area(int pincode, String police_s, String city) 
      {
		System.out.println(pincode);
		System.out.println(police_s);
		System.out.println(city);
	}	
	
	// Calling main method
	public static void main(String[] args)
      {
		
		// Scanner class object
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		// Taking input from the user and storing inside num_data
		System.out.print("How many data you want to enter: ");
		int num_data = scan.nextInt();
		
		// Creating a object of PoliceStation class
		PoliceStation ps1 =  new PoliceStation();
		
		// Checking the number of data using switch statement
		switch(num_data)
            {
			case 1:
				   // This will call the method which takes pincode as a agrument
				   ps1.Area(421301);
				   break;
			case 2:
				   // This will call the method which takes pincode and police station as a agrument
				   ps1.Area(421306, "Khadakpada");
				   break;
			case 3:
				   // This will call the method which takes pincode, police station and city as a agrument
				   ps1.Area(421301, "Khadakpada", "Kalyan");
				   break;
                  default: 
				   System.out.print("Invalid Input");
            }
      }
}