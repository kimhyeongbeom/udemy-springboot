package com.leopard2.doublecolon;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

class Test { 
	// 생성자 (Argument 1개짜리)
	public Test(String s) { 
		System.out.println("Constructor1 : " + s); 
	} 
	// 생성자 (Argument 1개짜리)
	public Test(String s1, String s2) { 
		System.out.println("Constructor2 : " + s1 + ", " + s2); 
	} 

	public static void main(String[] args) { 
		Function<String, Test> function1 = Test::new;
		Test test1 = function1.apply("AAA"); 
		BiFunction<String, String, Test> biFunction2 = Test::new;
		Test test2 = biFunction2.apply("bbb", "Ccc"); 
	} 
}
