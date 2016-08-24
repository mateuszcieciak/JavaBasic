package TypyGeneryczneZ3;

public class GenericArray<T extends Comparable<T>> {

	private T[] array;
	private MinMax<T> minMax;

	public GenericArray(T[] array) {
		this.array = array;
		minMax = null;
	}

	public MinMax<T> getMinMax() {
		if (array == null || array.length == 0)
			return null;

		T min = array[0];
		T max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(min) < 0)
				min = array[i];
			if (array[i].compareTo(max) > 0)
				max = array[i];
		}
		return new MinMax<T>(min, max);

	}

}
