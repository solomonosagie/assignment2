/* Assesment: assignment 2
 * student: Solomon Osagie
 * due date : July 28 2023
 * Description  :  creating a program to  check if a rod is within tolerance range  
 * professor :Veda Vasavi Erukulla
 */

class MetalRod {
	
    private static final double EPSILON = 0.002;// declaring the constant  EPSILON 
    private static final double TARGET_LENGTH = 5.55;// declaring the constant TARGET_LENGTH
    private double length;

    public MetalRod(double length) {
        this.length = length;
    }

    // Getters  for the length 
    public double getLength() {
        return length;
    }
    //setters for the length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to check if the rod is within the specified tolerance range
    public boolean rodIsWithinTolerance() {
        return Math.abs(length - TARGET_LENGTH) <= EPSILON;
    }
}




