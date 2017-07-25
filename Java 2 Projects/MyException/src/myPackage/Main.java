package myPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TroubleMaker m = new TroubleMaker();
		try {
			m.causeTrouble();
		} catch (MyException e) {
			e.printStackTrace();
			System.err.println(e.Message);
		}
		
	}

}
