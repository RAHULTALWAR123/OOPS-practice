// The Diamond Problem happens in multiple inheritance when:

// A class inherits from two parent classes.

// Both parent classes inherit from the same base class.

// The child class ends up with two possible copies of the base class’s methods/fields.

// The compiler cannot decide which version to use → ambiguity.

    A
   / \
  B   C
   \ /
    D

// B and C both inherit from A.

// D inherits from both B and C.

// If A has a method show(), D gets two paths to show():

// A → B → D

// A → C → D

// Ambiguity: Which show() should be called?


interface A{
    public void greet(){
        System.out.println("vv");
    }
}

interface B extends A{}
interface C extends A{}

class D implements B,C{
    @Override
    public void greet(){
        B.super.greet();
    }
}