public class Diagrama {
    class A {
        A() {
            System.out.println("Construtor padrão de A");
        }
    
        A(int arg) {
            this();
            System.out.println("Construtor de A com argumento: " + arg);
        }
    
        void a10() {
            System.out.println("Método a10 de A");
        }
    
        void a20() {
            System.out.println("Método a20 de A");
        }
    }
    
    class B extends A {
        B() {
            super();
            System.out.println("Construtor padrão de B");
        }
    
        B(int arg) {
            super(arg);
            System.out.println("Construtor de B com argumento: " + arg);
        }
    
        void a20() {
            super.a20();
            System.out.println("Método a20 de B");
        }
    }
    
    class C extends A {
        C() {
            super();
            System.out.println("Construtor padrão de C");
        }
    
        C(int arg) {
            super(arg);
            System.out.println("Construtor de C com argumento: " + arg);
        }
    
        void a10() {
            super.a10();
            System.out.println("Método a10 de C");
        }
    
        void c10() {
            System.out.println("Método c10 de C");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            A objA1 = new A();
            A objA2 = new A(100);
            System.out.println();
    
            B objB1 = new B();
            B objB2 = new B(200);
            System.out.println();
    
            C objC1 = new C();
            C objC2 = new C(300);
            System.out.println();
    
            objA1.a10();
            objA1.a20();
            System.out.println();
    
            objB1.a10();
            objB1.a20();
            System.out.println();
    
            objC1.a10();
            objC1.a20();
            objC1.c10();
        }
    }
    
    
}
