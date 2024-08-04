package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ConsoleInput ci = context.getBean(ConsoleInput.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ci.askStr("yes or no?");
    }
}
