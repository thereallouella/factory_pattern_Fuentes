package fuentes;


// PersonalComputer3 implements the Network interface where ping method must be implemented also
public class PersonalComputer3 implements Network {
	
	@Override
	
	// ping method that will output or display the ip of PC3
	public void ping() {
		System.out.println("PC3 ping... 192.168.10.03");
	}
}
