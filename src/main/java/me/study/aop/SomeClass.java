package me.study.aop;

/**
 * @author Władysław Kapciuk
 */
public class SomeClass {

    @LogExecution(timeLimit = 0, paramNames = {"Id", "Pojo"})
    public void someMethodWithArgs(long id, PojoClass pojoClass) throws InterruptedException {
        pojoClass.setId(id);
        Thread.sleep(1);
    }
}
