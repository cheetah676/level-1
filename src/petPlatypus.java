
public class petPlatypus {
		private String name;
		void sayHi(){
			System.out.println("The platypus " + name + " is smarter than your average platypus.");
		}
		public static void main(String[] args) {
			//1. Make an instance of your new pet platypus
			petPlatypus p1=new petPlatypus("bob");
			//2. Call the sayHi method
			//3. Create a constructor in the platypus class so that you can give your platypus a name.
		}
		public petPlatypus(String name){
		this.name = name;
		}
	}



