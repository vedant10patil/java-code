public class Triangle
{ 
    public static void printStars(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) 
       {
        for(j=2*(n-i); j>=0; j--)  
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
       } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}