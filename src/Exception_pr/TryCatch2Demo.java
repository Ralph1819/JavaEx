package Exception_pr;

public class TryCatch2Demo {

	public static void main(String[] args) {
		int dividend =10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}

	}

}
