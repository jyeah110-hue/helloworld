package e260417;

import e260417.dll.ImplementationC;
import e260417.dll.InterfaceA;
import e260417.dll.InterfaceB;
import e260417.dll.InterfaceC;

public class ImplementationExample {
    public static void main(String[] args) {
        //implements InterfaceC
        ImplementationC imp = new ImplementationC();

        InterfaceA a = imp;
        a.methodA();
        System.out.println();

        InterfaceB b = imp;
        b.methodB();
        System.out.println();

        //extends InterfaceA, InterfaceB
        InterfaceC c = imp;
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
