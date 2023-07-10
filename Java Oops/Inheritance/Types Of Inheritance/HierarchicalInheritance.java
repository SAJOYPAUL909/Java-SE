class A
{
    public void MethodA()
    {
            System.out.println("A class");
    }
}

class B extends A
{
    public void MethodB()
    {
            System.out.println("B class");
    }
}

class C extends A
{
    public void MethodC()
    {
            System.out.println("C class");
    }
}

class D extends B
{
    public void MethodD()
    {
            System.out.println("D class");
    }
}

class E  extends B
{
    public void MethodE()
    {
            System.out.println("E class");
    }
}

class HierarchicalInheritance
{
    public static void main(String[] args) 
    {
        System.out.println("calling method for object of class A");
        A a = new A();
        a.MethodA();
        
        System.out.println("calling method for object of class B");
        B b = new B();
        b.MethodA();
        b.MethodA();

        System.out.println("calling method for object of class C");
        C c = new C();
        c.MethodA();
        c.MethodC();

        System.out.println("calling method for object of class D");
        D d = new D();
        d.MethodA();
        d.MethodB();
        d.MethodD();

        System.out.println("calling method for object of class E");
        E e = new E();
        e.MethodA();
        e.MethodB();
        e.MethodE();

    }
}