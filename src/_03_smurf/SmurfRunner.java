package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handysmurf = new Smurf("handy");
	handysmurf.eat();
	System.out.println(handysmurf.getName());
	Smurf papasmurf = new Smurf("papa");
	System.out.println(papasmurf.getName());
	papasmurf.getHatColor();
	papasmurf.isGirlOrBoy();
	Smurf smurfette = new Smurf("");
	System.out.println(smurfette.getName());
	smurfette.getHatColor();
	smurfette.isGirlOrBoy();
}
	
}
