
package fuentes;  // Folder name where the java files inclosed


//PersonalComputer1 implements the Network interface where ping method must be implemented also
public class PersonalComputer1 implements Network {   
	
	@Override
	
	// a method that will display the ip address of pc 1
	public void ping() {
		
		// code that will print the ip of pc1
		System.out.println("PC1 ping... 192.168.10.01");
	}
}
