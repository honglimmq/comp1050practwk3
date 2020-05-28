public class HelloWorld{
	public static void main(String args[]){
		scream("Hello!")
		say("Hello World!")
	}

	public static void scream(String msg){
		System.out.println(msg);
		say("Hello World!")
	}

	public static void say(String msg){
		System.out.println(msg + "!");
	}
}