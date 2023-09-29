package task2;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Encrypt a character according to the given shif steps.
	public char encryptChar(char c) {
		char result = ALPHABET[(c - 'A' + n) % 26];
		return result;

	}

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			sb.append(encryptChar(c));
		}
		return sb.toString();
	}

	// Decrypt a character according to the given shif steps.
	public char decryptChar(char c) {
		char result = ALPHABET[(c - 'A' - n) % 26];
		return result;

	}

	// Decrypt a text using the above function for encrypting a charater.
	public String decrypt(String input) {
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			sb.append(decryptChar(c));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		MyCaesar test = new MyCaesar(3);

		System.out.println(test.encryptChar('G'));
		System.out.println(test.encrypt("ABCD"));
		
		System.out.println(test.decryptChar('F'));
		System.out.println(test.decrypt("MEYOU"));
	}
}
