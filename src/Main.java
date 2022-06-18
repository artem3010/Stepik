public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName.getCallerClassAndMethodName());
        anotherMethod();
        otherMethod();

    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName.getCallerClassAndMethodName());

    }
    private static void otherMethod() {
        System.out.println(getCallerClassAndMethodName.getCallerClassAndMethodName());
    }

}
