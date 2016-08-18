import java.util.*;

public class ArrayListProblem {

	public static void main(String[] args) {
		
		ArrayList<String> chars = new ArrayList<String>(10);
		chars.add("Bart Simpson");
		chars.add("Lisa Simpson");
		chars.add("Homer Simpson");
		chars.add("Marge Simpson");
		chars.add("Montgomery Burns");
		chars.set(1, "Lisa Van Houten");
		chars.remove("Montgomery Burns");
		chars.add("Maggie Simpson");
		
		System.out.println(chars);
	}
	

}
