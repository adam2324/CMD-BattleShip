import java.util.Scanner;

public class Grid{

	public static void main(String[] args){
		int shots = 0;
		int score;
		
		//create ship
		String b1Name = "Truman";
		Bship b1 = new Bship();
		b1.setName(b1Name);
		b1.setSize();
		int hitsLeft = b1.getSize();
		
		//create grid
		int grid[];
		grid = new int[8];
		
		//get starting pos
		int pos = (int) (Math.random() * 6);
		//System.out.println("Debug: Random is " + pos);
		System.out.println("");
		
		//place ship
		int loopCount = b1.getSize();
		while(loopCount > 0){
			grid[pos] = 1;
			//System.out.println("Debug: Placed at "+ pos);
			loopCount--;
			pos++;
		}
		
		//get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Input target location (0-7)");
		
		while(hitsLeft > 0){
			int input = sc.nextInt();
			if(input < 8){
				if(grid[input] == -1) {
				System.out.println("Already bombed that area");
				} if(grid[input] == 0) {
				System.out.println("Miss!");
				shots++;
				} if(grid[input] == 1){
				System.out.println("Hit!");
				grid[input] = -1;
				hitsLeft--;
				shots++;
				}
			}
			else{
				System.out.println("Invalid Input");
			}
		}
		
		score = ((8-shots) * 100);
		
		System.out.println("You sunk the ship " + b1Name + "! Good Job!");
		System.out.println("Shots: " + shots);
		System.out.println("Score: " + score);
		
	}
		
}
