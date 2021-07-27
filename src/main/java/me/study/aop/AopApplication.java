package me.study.aop;

public class AopApplication {

    public static void main(String[] args) {
        PojoClass pojoClass = new PojoClass()
                .setId(1)
                .setName("name")
                .setShortName("shortName");

        SomeClass someClass = new SomeClass();

        someClass.someMethodWithArgs(2, pojoClass);
    }

}
