package oops.lecture3;

public class EncapsulationAbstraction {

}
/*
 * Encapsulation 🗃️
 Encapsulation is an implementation-level concept. Its primary purpose is to
 * protect an object's internal state and ensure data integrity. Think of it as
 * a protective capsule or a box. You can see the outside of the box, but you
 * can't see or touch what's inside directly. To interact with the contents, you
 * must use the provided "doors" or "buttons" on the outside (the public
 * methods).
 * 
 * 
 * 
 * Key Aspects:
 * Focus: It focuses on "how" the object achieves its functionality.
 * 
 * Mechanism: It is implemented by using access modifiers (like private,
 * protected, public) to restrict direct access to an object's data (fields).
 * Public methods, often called "getters" and "setters," are provided to allow
 * controlled access to the private data.
 * 
 *Goal: The goal is data hiding. It ensures that the internal data of a class
 * can't be accidentally or maliciously changed from outside the class.
 *  
 * Example: A Bank Account class might have a balance field declared as private.
 * You can't directly change the balance from outside the class. Instead, you
 * must use public methods like deposit(amount) or withdraw(amount), which can
 * include validation logic to prevent invalid transactions (e.g., withdrawing
 * more money than available).
 * 
 * 
 * Abstraction 🧊
 * Abstraction is a design-level concept. Its goal is to manage complexity by
 * showing only a simplified, high-level view of a system. It answers the
 * question, "what" does this object do, without getting into the details of how
 * it does it. This allows developers to focus on the essential functionality
 * without being overwhelmed by the intricate implementation details.
 * 
 * 
 * Key Aspects:
 * Focus: It focuses on "what" the object does.
 * 
 * Mechanism: It is implemented using abstract classes and interfaces. An
 * interface, for instance, defines a "contract" of methods that a class must
 * implement, but it doesn't provide the actual code for those methods.
 * 
 * Goal: The goal is to hide implementation complexities. It presents a clean,
 * simple interface to the user.
 * 
 * Example: A Vehicle interface might have methods like startEngine() and
 * stopEngine(). When you drive a car, you don't need to know the complex
 * mechanics of how the engine starts or how the fuel ignites. You just know
 * that pressing a button or turning a key will start the engine. The internal
 * complexities are abstracted away.
 */