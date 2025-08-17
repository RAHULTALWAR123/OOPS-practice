class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5)); // No object needed
    }
}


// Belong to the class, not to an instance.
// Can be called using the class name: ClassName.methodName().
// Cannot access instance variables or instance methods directly.
// Can access other static members of the class.