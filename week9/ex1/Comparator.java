public class Comparator<T extends Comparable<T>> {
	public T getMax(T n, T m) {
        return ((n.compareTo(m)>0)? n:m);
    }
}