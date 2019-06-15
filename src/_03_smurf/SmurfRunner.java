package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handysmurf = new Smurf("Handy");
	handysmurf.eat();
	System.out.println(handysmurf.getName());
	Smurf papasmurf = new Smurf("papa");
	System.out.println(papasmurf.getName());
	System.out.println(papasmurf.getHatColor());
	System.out.println(papasmurf.isGirlOrBoy());
	Smurf smurfette = new Smurf("smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
	
}
