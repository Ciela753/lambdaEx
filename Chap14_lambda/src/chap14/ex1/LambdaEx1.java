package chap14.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface MyFunction {
	void run();
}
//뭘 반환하는가 뭘 파라미터로 가져오는가
public class LambdaEx1 {
	static void execute(MyFunction f) {
		f.run();
	}
	static MyFunction getMyFunction() {
		return () -> System.out.println("f3.run()");
	}
	public static void main(String[] args) {
		//지역클래스, 익명클래스, 내부클래스(final파라미터만 가능)
		MyFunction f1 = () -> System.out.println("f1.run()");
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("F2.run()");
				
			}
		};
		
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(()-> System.out.println("run()"));
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println((MyFunction)()->{});
//		System.out.println(()->{});
		new ArrayList<String>().stream().map(new Function<String, Integer>() {
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		});
		Object a = (Object)(MyFunction)() -> System.out.println("f1.run()");
	}
}
