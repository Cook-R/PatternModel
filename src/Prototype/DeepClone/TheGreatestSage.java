package Prototype.DeepClone;

import java.io.IOException;

public class TheGreatestSage {
    private Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        Monkey copymonkey = (Monkey) monkey.deepClont();
        System.out.println("大圣的生日是" + monkey.getBirthday());
        System.out.println("小猴子的生日是" + copymonkey.getBirthday());
        System.out.println("大圣和小猴子是一个对象吗" + (monkey == copymonkey));
        System.out.println("是一个吗" + (monkey.hashCode() == copymonkey.hashCode()));

        System.out.println("金箍棒是一个吗" + (monkey.getGrsf() == copymonkey.getGrsf()));
        System.out.println("hashcode是一个吗" + (monkey.getGrsf().hashCode() == copymonkey.getGrsf().hashCode()));

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
