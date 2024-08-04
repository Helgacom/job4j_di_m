package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);

        ConsoleInput ci = context.get(ConsoleInput.class);
        ci.askStr("yes or no?");
    }
}