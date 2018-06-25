
public class StringToys {

	// The following come from codingbat.com/java

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		String begin_tag = "<" + tag + ">";
		String end_tag = "</" + tag + ">";
		return begin_tag + word + end_tag;
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}

	public String extraEnd(String str) {
		String last_two = str.substring(str.length() - 2);
		return last_two + last_two + last_two;
	}

	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}
}
