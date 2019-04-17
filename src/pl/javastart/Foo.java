package pl.javastart;

class Foo {

    static {
        System.out.println(1/0);
    }

    static void foo() {
        System.out.print("A");
    }

}
