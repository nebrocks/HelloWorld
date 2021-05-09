class Demo1{
	public static void main(String... args){
		Runnable r = ()->{
			for(int i=1;i<=10;i++){
				System.out.println("i : "+i);
			}
		};
		
		new Thread(r,"T1").start();
	
	}
}