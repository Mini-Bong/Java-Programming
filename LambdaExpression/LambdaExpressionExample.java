package JavaProgramming.LambdaExpression;

import java.util.HashMap;

@FunctionalInterface
interface Square{
    int calculate(int x);
}

interface FuctInterface {

    void abstractFun(int x);
    
    default void normalFuction(){
        System.out.println("Hello");
    }
    
}

public class LambdaExpressionExample {

    public static void main(String[] args) {


        Square square = new Square() {
            public int calculate(int x){
                return x * x;
            }
        };

        square.calculate(20);

        FuctInterface fuctInterface = (int x) -> System.out.println(2 * x);
        fuctInterface.abstractFun(5);

        Square s = (int x) -> x * x;
        System.out.println("The square is : " + s.calculate(10));

        // Map<Integer, Integer> mp = new HashMap<>()
    }
    
}
