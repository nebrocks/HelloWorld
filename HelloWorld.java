class HelloWorld{
	public static void main(String... args){
		System.out.println("HelloWorld");
		go();
		set();
		System.out.println("Main end..");
	}
	
	public static void go(){
		System.out.println("Go method got called..");
		
	}
	
	public static void set(){
		System.out.println("Set method got called..");
		
	}
}