package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import bean.Iteam;

public class Ex03 {
	public static void main(String[] args) {
		Iteam[] iteam = getIteam();
		//sort(iteam);
		
		//Arrays.sort(iteam,comparing(Iteam::getId,reverseOrder()));
		//Arrays.sort(iteam,comparing(Iteam::getId).thenComparing(Iteam::getName));
		//Arrays.sort(iteam,comparing(Iteam::getName));
		
		/*
		 * Arrays.sort(iteam,new Comparator<Iteam>() {
		 * 
		 * @Override public int compare(Iteam o1, Iteam o2) { if(o1.getId()>o2.getId())
		 * { return 1; } if(o1.getId()<o2.getId()) { return -1; }
		 * if(o1.getId()==o2.getId()) { return o1.getName().compareTo(o2.getName()); }
		 * return o1.getId()-o2.getId(); } });
		 */
		
		Arrays.stream(iteam).forEach(iteams ->System.out.println(iteams));
	}

private static Iteam[] getIteam() {
	return new Iteam[] {
			new Iteam(1,"D"),
			new Iteam(2,"B"),
			new Iteam(6,"A"),
			new Iteam(4,"K"),
			new Iteam(4,"E"),
			new Iteam(3,"F")
			};

}

	private static void sort(Iteam[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					continue;
				}
				if (sequences[out] == null || sequences[in].getId() > sequences[out].getId() ) {
					Iteam tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}

			}
		}
	}

}
