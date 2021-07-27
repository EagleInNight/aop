package me.study.aop;

/**
 * @author Władysław Kapciuk
 */
public class SomeClass {

    @Timed(measure = 0, paramNames = {"Id", "Pojo"})
    public void someMethodWithArgs(long id, PojoClass pojoClass) {
        pojoClass.setId(id);
    }
}
