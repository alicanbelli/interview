package OCType.day11;

public class OCType03 {

	public static void main(String[] args) {

		String [] arr = {"A", "B", "C", "D"};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
			if(arr[i].equals("C")){
				break;
		}
			System.out.println("Work Done");
			continue;
		}
	}

}
