package assignment02_redo;

public class AB_Redo {
	
	public String abRedo (int a, int b) {
		String result = "";
		for (int i = 0; i < Math.pow(2, a); i++) {
			String binaryString = "";
			int aCount = 0;
			int pairCount = 0;
			binaryString = String.format("%" + a + "s", Integer.toBinaryString(i)).replace(' ', '0');
			for (int j = 0; j < binaryString.length(); j++) {
				if (binaryString.charAt(j) == '1') {
					aCount++;
				}
				if (binaryString.charAt(j) == '0') {
					pairCount += aCount;
				}
			}
			if (pairCount == b) {
				result = binaryString.replace('1', 'A');
				result = result.replace('0', 'B');
				return result;
			}
		}
		return result;
	}
}
