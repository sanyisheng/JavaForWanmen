package buaa.dal.basics;

public class UseIntArray {
	public static void main(String[] args) {
		int intArray[] = { 8, 9, 12,13,14};
		int sum = 0;
		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i];
		for (int i = 0; i < intArray.length; i++)
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		System.out.println();
		System.out.println("sum=" + sum);
	}
}
