
public class handySmurf {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("BOB");
		smurf.eat();
		System.out.println(smurf.getName() + "  I am a " + smurf.isGirlOrBoy() + ".  I also have a " + smurf.getHatColor() + " hat.");

	}
}
