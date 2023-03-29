// Folder containing the classes and interfaces/java.files or can be called project folder.	
package fuentes;


// public class that will demonstrate or test run the factory design pattern
public class FactoryDemo {
	
	// this is where the output or running of the program started.
	public static void main(String[] args) {
		
		
		// Pass the NetworkPingFactory Class to shapeFactory variable
		NetworkPingFactory shapeFactory = new NetworkPingFactory();

		// Get an Object of pc1 and call its method ping that will output its ip address and PC1 name
	    Network pc1 = shapeFactory.getIP("PC1");
	    pc1.ping();

	    // Get an Object of pc2 and call its method ping that will output its ip address and PC2 name 
	    Network pc2 = shapeFactory.getIP("PC2");
	    pc2.ping();

	    // Get an Object of pc3 and call its method ping that will output its ip address and PC3 name
	    Network pc3 = shapeFactory.getIP("PC3");
	    pc3.ping();

	  }
}