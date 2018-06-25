public class JavaToys {

	public static void main(String[] args) {

		StringToys stringtoy = new StringToys();
		ArrayToys arraytoy = new ArrayToys();
		/*
		 * System.out.println(stringtoy.helloName("Britton"));
		 * System.out.println(stringtoy.makeAbba("Hi","Bye"));
		 * System.out.println(stringtoy.makeTags("i","Hello"));
		 * System.out.println(stringtoy.makeOutWord("<<>>", "Yay"));
		 * System.out.println(stringtoy.extraEnd("uno"));
		 * System.out.println(stringtoy.firstTwo("abcdefg"));
		 * System.out.println(stringtoy.firstHalf("WooHoo"));
		 */

		int[] array1 = { 6, 5, 4 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] array3 = { 1, 2, 3, 1 };
		System.out.print(arraytoy.firstLast6(array1));
		System.out.println("");
		System.out.print(arraytoy.sameFirstLast(array2));
		System.out.println("");
		int[] pi = arraytoy.makePi();
		System.out.print(pi);
		System.out.println("");
		System.out.print(arraytoy.commonEnd(array2, array3));
	}

}
