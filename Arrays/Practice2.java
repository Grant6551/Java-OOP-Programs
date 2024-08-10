class Practice2{
	int[][] multi;

	public void Table(int[][] multiTable){
		multi = multiTable;
	}

	public void MT(){
		multi = new int[12][12];
		for(int i =0; i<12; i++){
			for(int j = 0; j<12; j++){
				multi[i][j] = (i+1)*(j+1);
			}
		}

		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
			 System.out.print(multi[i][j] + " "); 
			}
			System.out.println("\n");
		}

	}

	public void MT(int x, int y){
		multi = new int[x][y];
		for(int i =0; i<x; i++){
			for(int j = 0; j<y; j++){
				multi[i][j] = (i+1)*(j+1);
			}
		}

		for(int i = 0; i<x; i++){
			for(int j = 0; j<y; j++){
			 System.out.print(multi[i][j] + " "); 
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args){
		Practice2 box = new Practice2();

		box.MT();
		box.MT(10, 7);
	}
}