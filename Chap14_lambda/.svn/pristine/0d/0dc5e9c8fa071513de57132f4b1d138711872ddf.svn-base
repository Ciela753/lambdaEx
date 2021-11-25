import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiFunction;


public class LamdaExPrev {
	//람다식 : 메서드 >> 식 결과적으로 메서드명, 반환키워드가 사라짐(익명함수와 유사해짐)
	
	//function() {} // () => {}
	int method() {
		return (int)(Math.random() * 5) + 1;
	}
	{
		int result1 = method();
		Runnable result2 = () -> System.out.println((int)(Math.random() * 5) + 1);
		//메서드 파라미터로 함수가 들어감. 익명함수와 동일
		//파라미터의 타입도 날아감
		
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.forEach((String str)->{System.out.println(str);} );
		list.forEach((String str)->System.out.println(str) );
		list.forEach((str)-> System.out.println(str) );
		list.forEach(str-> System.out.println(str) );
		
		MyFunction f = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				return a>b ? a:b;
			}
		};
		
		int result = f.max(3, 5);
		System.out.println(result);
		
		MyFunction f2 = (a, b) -> a>b? a:b;
		Comparator<Addr> comp = (a, b) -> a.no - b.no;
		BiFunction<Addr, Addr, Integer> bi = (a, b) -> a.no - b.no;
		
		
		result = f2.max(4, 3);
		System.out.println(result);
		
		//addr타입의 generic을 가지는 treeset객체를 생성하시오
		//treeset의 이름은 set으로 하고 정렬규칙은 no의 역순으로 지정
//		TreeSet<Addr> set = new TreeSet<Addr>(new Comparator<Addr>() {
//
//			@Override
//			public int compare(Addr o1, Addr o2) {
//				return o2.no - o1.no;
//			}
//		});
		TreeSet<Addr> set = new TreeSet<Addr>((o1, o2)-> o2.no - o1.no );
		
		//함수형 인터페이스
		//override 다음에 올 메서드는 반드시 오버라이딩해야한다.
		
		f2.test2();
		MyFunction.test();
		
		
	}
}

//람다식의 베이스가 되는 함수는 반드시 메서드를 하나만 포함ㅇ해야함
//static메서드와 default메서드는 리턴값이 있으면 인터페이스에 작성 가능
@FunctionalInterface 
interface MyFunction {
	int max(int a, int b);
	static int test() {
		return 10;
	}
	default String test2() {
		return "abc";
	}
}
class Addr {
	int no;
	String name;
}

//파라미터랑 리턴타입 같으면 operator