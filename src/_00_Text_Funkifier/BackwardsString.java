package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String n = "";
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			n+=c[i];
		}
		return n;
	}

}
