package Assignment2.persistance;

public class Client {
public static void main(String[] args) {
	Persistance persistance;
	boolean a = false;
	
	if(a) {
		persistance = new DatabasePersistance();
	} else {
		persistance = new FilePersistance();
	}
	persistance.persist();
}
}
