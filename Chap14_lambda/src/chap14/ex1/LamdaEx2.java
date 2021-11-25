package chap14.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;

public class LamdaEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("가");
		list.add("나");
		list.add("다");
		
		list.removeIf(s->s.equals("가"));
		
		System.out.println(list);
		
		list.replaceAll(s->s + "A");
		
		System.out.println(list);
		
		list.forEach(s->System.out.println(s));
		
		list.stream().filter(s->true);
		//어떤값을 쓰는 a는 int타입
		IntFunction<String> intFunction = (a) -> {return a+a +" ";};
		DoubleFunction<Integer> df = (x) -> (int)x;
		DoubleToIntFunction dtif = (x) -> (int)x;
		ObjIntConsumer<String> oic = (a, b) -> System.out.println(a+"::"+b);
		
		//파라미터 2개 리턴x
		BiConsumer<String, Integer> bc = (a, b) -> System.out.println(a+"::"+b);
	}
}
