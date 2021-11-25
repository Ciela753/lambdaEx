package chap14.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("가");
		list.add("나");
		list.add("다");
		
		System.out.println(list);
		
		UnaryOperator<String> uo1 = s->s+"0";
		UnaryOperator<String> uo2 = s->s+"a";
		
		uo1.andThen(uo2);
		
		//람다식 사용시 캐스팅 주의
//		list.replaceAll((UnaryOperator<String>)uo1.andThen(uo2));
		
		//812p 중요
		//메서드 레퍼런스		
		Function<String, Integer> f= s -> Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt;
		
		//같은 결과
		list.forEach(System.out::println);		
		list.forEach(s->System.out.println(s));
		
		//같은 결과
		BiFunction<String, String, Boolean> bi = (s1, s2)->s1.equals(s2);
		BiFunction<String, String, Boolean> bi2 = String::equals;
		
		Supplier<String> supplier = String::new;
		
		//컨슈머 외울것
		//람다식 모르겠으면 메서드(()->{})부터 시작
	}
}
