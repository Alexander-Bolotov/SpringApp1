package ru.bolotov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(AppConfig.class);
        configApplicationContext.refresh();
        HelloWorld helloWorld = configApplicationContext.getBean("helloWorldBean", HelloWorld.class);
        HelloWorld helloWorld1 = configApplicationContext.getBean("helloWorldBean", HelloWorld.class);

        Cat cat = configApplicationContext.getBean("catBean", Cat.class);
        Cat cat1 = configApplicationContext.getBean("catBean", Cat.class);

        boolean comparisonHW = helloWorld == helloWorld1;
        boolean comparisonCat = cat == cat1;

        System.out.println("Сравнение HelloWorld = " + comparisonHW);
        System.out.println("Сравнение Cat = " + comparisonCat);

        configApplicationContext.close();
    }
}
