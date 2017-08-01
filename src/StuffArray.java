
public class StuffArray {
public static void main(String[]args){
	String[] pokemonArray={"Bayleef", "Psduck", "Goodra", "Frokie"};
	for (int i = 0; i < pokemonArray.length; i++) {
		System.out.println(pokemonArray[i]);
	}
	String[] awesomeStuff=new String[2];
	awesomeStuff[0]="Frogadier";
	awesomeStuff[1]="Greninja";
	for (int i = 0; i < awesomeStuff.length; i++) {
		System.out.println(awesomeStuff[i]);
	}
}
}
