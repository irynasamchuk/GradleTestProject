import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification



class HelloSpec extends Specification {
    def hello = new Hello();
    Logger log = LoggerFactory.getLogger(HelloSpec.class)

    def sayHello() {
       // log.info("Start the test to say Hello Ira")
        given: "A  person's name is given as a method paramether."
        def greeting = hello.sayHello("Ira");

        expect: "Should say hello to the person whose name is given as a method parameter"
        greeting == "Hello Ira yyy";
    }
}
