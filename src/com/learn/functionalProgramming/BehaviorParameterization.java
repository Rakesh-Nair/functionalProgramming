package com.learn.functionalProgramming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BehaviorParameterization {
	
	public static void main(String args[]) {
		List<Integer> numbers = List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14);
		
		Predicate<Integer> evenPredicate = x -> x%2 == 0;
		Predicate<Integer> oddPredicate = x -> x%2 != 0;
		
		//filterAndPrint(numbers, evenPredicate);
		
		
		//Function
		
		Function<Integer, Integer> squareFunction = x -> x*x;
		System.out.println("Square of 2 is "+squareFunction.apply(2));
		
		//Consumer
		Consumer<Integer> sysoutConsumer =  x -> System.out.println("Consumed "+x);
		sysoutConsumer.accept(2);
		
		//Binary Operator
		BinaryOperator<Integer> addOperator = (x,y) -> x+y;
		System.out.println("Addition of 2 and 4 is "+ addOperator.apply(2, 4));
		
		//Supplier
		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		System.out.println("Random integer generated is "+supplier.get());
		
		//Unary Operator
		UnaryOperator<Integer> doubleOperator = (x) -> 2*x;
		System.out.println("Double of 4 is "+doubleOperator.apply(4));
		
		//BiPredicate
		BiPredicate<Integer, Integer> checkMultiple = (x,y) -> x%y == 0 || y%x ==0;
		System.out.println("Check Multiple 5, 10 - "+checkMultiple.test(5, 10));
		
		//BiFunction
		BiFunction<Integer, Integer, String> stringConverter = (x,y) -> x+" and "+y;
		System.out.println("StringConverter returns "+stringConverter.apply(5, 6));
		
		//BiConsumer
		BiConsumer<Integer, Integer> addConsumer = (x,y) -> System.out.println(x+y);
		addConsumer.accept(5, 15);
		//IntBinaryOperator
		
		//IntConsumer
		
		//IntFunction
		
		//IntPredicate
		
		//IntSupplier
		
		//InttoDoubleFunction
		
		//InttoLongFunction
		
		//IntUnaryOperator
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> evenPredicate) {
		numbers.stream().filter(evenPredicate ).forEach(System.out::println);
	}

}
