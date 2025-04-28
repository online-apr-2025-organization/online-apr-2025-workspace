
public class OneDimensionDemo {

	public static void main(String[] args) {
		int marks;
		marks = 60;
		
		int marks1 = 77;
		
//		int[] myMarks;
//		myMarks = new int[4];
		int[] myMarks = new int[4];
		
		myMarks[0] = 60;
		myMarks[1] = 50;
		myMarks[2] = 80;
		myMarks[3] = 100;
		
		for(int i=0;i<myMarks.length;i++) {
			System.out.println(myMarks[i]);
		}
		
		// initialize a one dimensionl array
		int[] myMarks1 = {10, 20, 30};
	}

}
