public class JavaCode2 {

    public String foo(String name, int number, boolean toUpperCase) {
        return (toUpperCase ? name.toUpperCase() : name) + number;
    }
    public String foo(String name, int number) {
        return foo(name, number, false);
    }
    public String foo(String name, boolean toUpperCase) {
        return foo(name, 42, toUpperCase);
    }
    public String foo(String name) {
        return foo(name, 42);
    }

    public static void main(String[] args) {
        JavaCode2 jc2 = new JavaCode2();

        System.out.println(jc2.foo("a"));
        System.out.println(jc2.foo("b", 1));
        System.out.println(jc2.foo("c", true));
        System.out.println(jc2.foo("d", 2, true));
    }
}
