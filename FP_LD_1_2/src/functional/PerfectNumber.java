package functional;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class PerfectNumber {
	
	public enum STATE{
		DEFICIENT, PERFECT, ABUNDANT
	}
	
	public static Set<Integer> divisors(int n){	
		Set<Integer> set = IntStream
				.rangeClosed(1, (int)Math.sqrt(n))
				.flatMap(i -> IntStream.of(i, n/i))
				.filter(i -> n%i == 0)
				.boxed()
				.collect(Collectors.toSet());
		return set;
	}

	public static STATE process(int n) {
		Function<Integer, STATE> PerfectOrAbundant =  divSum -> Optional.of(divSum)
				.filter(sum -> sum == n)
				.map(sum -> STATE.PERFECT)
				.orElse(STATE.ABUNDANT);
		return divisors(n)
				.stream()
				.filter(i -> i != n)
				.reduce((sum, i) -> sum + i)
				.filter(sum -> sum >= n)
				.map(PerfectOrAbundant)
				.orElse(STATE.DEFICIENT);			
	}

	public static void main(String[] args) {
	}
}
