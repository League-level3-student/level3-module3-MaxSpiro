package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] c = s.toCharArray();
		s="";
		for(int i=0;i<c.length;i++) {
			if(c[i]<=90 && c[i]!=32) {
				c[i]+=32;
			}
		}
		for(int i=0;i<c.length;i++) {
			if(i%2!=0) {
				if(c[i]!=32)
					c[i]-=32;
			}
		}
		for(int i=0;i<c.length;i++) {
			s+=c[i];
		}
		return s;
	}

}
