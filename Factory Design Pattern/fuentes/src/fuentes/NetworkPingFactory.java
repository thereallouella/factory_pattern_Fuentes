// Project Folder
package fuentes;

// a class or factory to generate object of concrete class based on given information.
public class NetworkPingFactory { 
	   public Network getIP(String pc){
		  
		  // if given information is empty string or null return null.
	      if(pc == null){
	         return null;
	      }		
	      
	      // if given string is PC1 then return the class PersonalComputer1 that will output its IP address of PC1
	      if(pc.equalsIgnoreCase("PC1")){
	         return new PersonalComputer1();
	        
	         
	      // if given string is PC2 then return the class PersonalComputer2 that will output its IP address of PC2
	      } else if(pc.equalsIgnoreCase("PC2")){
	         return new PersonalComputer2();
	      
	         
	      // if given string is PC3 then return the class PersonalComputer3 that will output its IP address of PC3
	      } else if(pc.equalsIgnoreCase("PC3")){
	         return new PersonalComputer3();
	      }
	      
	      return null;
	   }
}
