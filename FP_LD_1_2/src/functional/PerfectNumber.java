package functional;
import java.util.*;
import java.util.stream.*;

public class PerfectNumber {
	
	public enum STATE{
		DEFICIENT, PERFECT, ABUNDANT
	}
	
	public static Set<Integer> divisors(int n){	
		Set<Integer> set = IntStream
				.rangeClosed(1, n)
				.filter(i -> n%i == 0)
				.boxed()
				.collect(Collectors.toSet());
		return set;
	}

	public static STATE process(int n) {
		Set<Integer> set = new HashSet<Integer>();
		set = divisors(n);
		int Sum = 0;
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
		   Sum+= (int)iterator.next();
		}
		Sum-=n;
		if (Sum < n ) return STATE.DEFICIENT;
		if (Sum == n ) return STATE.PERFECT;
		return STATE.ABUNDANT;			
	}
	public static void main(String[] args) {
	}
}
