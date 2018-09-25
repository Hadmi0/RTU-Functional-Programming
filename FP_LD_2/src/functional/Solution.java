package functional;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Solution {
	
	public static int result = 0;
	
	public static int RecursiveSubtraction(int X, int N, int num, int pos) {
		
		Optional.of(X)
			.filter(i -> i == 0)
			.map(i -> result++);
		
		int Max = (int) Math.floor(Math.pow(num, 1.0 / N));
		Function<Integer, Integer> subtract = i -> X - (int)Math.pow(i, N);
		IntStream.rangeClosed(pos + 1 , Max)
			.filter(i -> subtract.apply(i) >= 0)
			.map(i ->RecursiveSubtraction(subtract.apply(i), N, num, i))	
			.sum();
		return result;
	}
	public static int PowerSum (int X, int N) {
		return RecursiveSubtraction(X,N,X,0);
	}
	public static void main(String[] args) {
		System.out.println(PowerSum(100,2));
	}

}
