package learningtest.org.openrewrite.staticanalysis;

import org.junit.jupiter.api.Test;

/**
 * Tests for {@literal org.openrewrite.staticanalysis.InstanceOfPatternMatch}.
 *
 * @author Johnny Lim
 */
class InstanceOfPatternMatchTests {

    @Test
    void test() {
        Animal animal = new Human();

        if (animal instanceof Human) {
            Human human = (Human) animal;
            human.doSomethingSmarter();
        }
    }

    interface Animal {
    }

    static class Human implements Animal {

        void doSomethingSmarter() {
            System.out.println("doSomethingSmarter()");
        }

    }

}
