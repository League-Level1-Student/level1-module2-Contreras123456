package _01_getters_and_setters;

public class PersonRunner {

	public static void main(String[] args) {
		Person elmo = new Person();
		Person kermit = new Person();
		Person jimmyneutron = new Person();
		
		elmo.setSuperpower("Education");
		kermit.setSuperpower("Kermit power");
		jimmyneutron.setSuperpower("being smart");
		
		elmo.setName("Teletubbie");
		kermit.setName("Blue");
		jimmyneutron.setName("Ronald McDonald");
		
		System.out.println(elmo.toString());
		System.out.println(kermit.toString());
		System.out.println(jimmyneutron.toString());
	
}
}
