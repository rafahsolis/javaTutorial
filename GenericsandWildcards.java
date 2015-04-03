package tutorialJava;

import java.util.ArrayList;

public class GenericsandWildcards {
	public static void main(String[] args) {
		ArrayList<Machine> list = new ArrayList<Machine>();
		list.add(new Machine());
		list.add(new Machine());

		ArrayList<Camara> list2 = new ArrayList<Camara>();
		list.add(new Camara());
		list.add(new Camara());

		showList(list);
		showList2(list);
		showList3(list);
		showList3(list2);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}

	public static void showList2(ArrayList<? super Camara> list) {
		for (Object value : list) {
			System.out.println(value);

		}
	}
	public static void showList3(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);

		}
	}

}
