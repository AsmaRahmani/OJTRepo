package week5;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int name [][] = {{1,2,3},{2,5,6},{6,6,5}};
				for(int i = 0; i<name.length; i++){
					for(int j = 0; j<name.length; j++){
						System.out.print(name[i][j]+ " ");
					}
					System.out.println();
				}
		}

	}

