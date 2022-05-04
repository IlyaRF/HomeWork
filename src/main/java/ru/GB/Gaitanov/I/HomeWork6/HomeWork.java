package ru.GB.Gaitanov.I.HomeWork6;

public class HomeWork {
    public static void main(String[] args) {


        final Cat Murzik = new Cat ("Мурзик", 100 , 300);
        final  Cat Barsik = new Cat ("Барсик", 100 , 500);
        final  Cat Kuzya = new Cat ("Кузя", 100 , 500);

        final  Dog Sharik = new Dog ("Шарик", 0 , 200);
        final  Dog Bobik = new Dog ("Бобик", 0 , 200);
        final  Dog Tuzik = new Dog ("Тузик", 0 , 200);


Sharik.runLength(300);
        System.out.println(Sharik.getRunLength());

    }
}
