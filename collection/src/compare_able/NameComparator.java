package compare_able;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp2> {

//	compare two objects based on string --------- (COMPARATOR)

	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
