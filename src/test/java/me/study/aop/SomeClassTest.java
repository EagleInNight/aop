package me.study.aop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Władysław Kapciuk
 */
class SomeClassTest {

    @Test
    @DisplayName("test aop")
    void testAop() throws InterruptedException {
        PojoClass pojoClass = new PojoClass()
                .setId(1)
                .setName("name")
                .setShortName("shortName");

        SomeClass someClass = new SomeClass();

        someClass.someMethodWithArgs(2, pojoClass);
    }
}