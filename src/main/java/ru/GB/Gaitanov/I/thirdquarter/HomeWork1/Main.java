package ru.GB.Gaitanov.I.thirdquarter.HomeWork1;

public class Main {

    public static void main(String[] args) {

        Box<Orange> oranges = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Apple> apples = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );

        apples.moveTo(apples);
    }

}

