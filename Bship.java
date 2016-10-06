public class Bship{
	private int size;
	private String name;
	
	public int getSize(){
		return size;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSize(){
		int x = (int) (Math.random() * 10);
			if(x > 4){
				size = 3;
			} else {
				size = 2;
			}
		//System.out.println("Debug: " + name + "'s Size is " + size);
	}
	
	public void setName(String n){
		name = n;
		//System.out.println("Debug: Name = " + name);
	}
}