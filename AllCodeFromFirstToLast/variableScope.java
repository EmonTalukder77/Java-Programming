public class variableScope {
    int x = 3; // class variable

    public static void main(String[] args) {

        int x = 1;// local variable
        System.out.println(x);
        doSomething();

    }

    static void doSomething() {
        int x = 2;// Local
        System.out.println(x);

    }
}
