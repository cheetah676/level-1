
public class Athlete {
String name;
int speed;
int bibNum;
static int count=0;
static String location="nowhere";
static int startTime=200000000;
public Athlete(int bibNum, int speed, String name) {
		// TODO Auto-generated constructor stub
	this.bibNum=bibNum;
	this.speed=speed;
	this.name=name;
	count+=1;
	}
public static void main(String[]args) {
	Athlete Bob=new Athlete(1, 10, "Bob");
	Athlete Joe=new Athlete(2, 9, "Joe");
	Athlete Bayleef=new Athlete(3, 999999999, "Bayleef");
	System.out.println("Hi, my name is "+Bob.getName()+" and my bib number is "+Bob.getBibNum());
	System.out.println("Hi, my name is "+Joe.getName()+" and my bib number is "+Joe.getBibNum());
	System.out.println("Hi, my name is "+Bayleef.getName()+" and my bib number is "+Bayleef.getBibNum());
}
String getName(){
	return name;
}
int getBibNum() {
	return bibNum;
}

}
