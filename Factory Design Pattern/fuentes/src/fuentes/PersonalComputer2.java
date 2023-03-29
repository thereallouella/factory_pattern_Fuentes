package fuentes;
//PersonalComputer2 implements the Network interface where ping method must be implemented also
public class PersonalComputer2 implements Network {
	
	@Override
	
	// a method when called will display or output the ip adress of pc2
	public void ping() {
		System.out.println("PC2 ping... 192.168.10.02");
	}
}
