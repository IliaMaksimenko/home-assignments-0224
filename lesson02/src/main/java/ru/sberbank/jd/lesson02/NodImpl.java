package ru.sberbank.jd.lesson02;

/**
 * Класс для определения наибольшего общего делителя двух целых чисел.
 */
public class NodImpl implements Nod {

    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {
        return second == 0 ? first : calculate(second, first % second);
    }
}
