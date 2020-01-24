import spock.lang.Specification;

class HelloSpec extends Specification {
    def hello = new Hello();

    def sayHello() {
        given: "A  person's name is given as a method paramether."
        def greeting = hello.sayHello("Ira");

        expect: "Should say hello to the person whose name is given as a method parameter"
        greeting == "Hello Ira";
    }
}
