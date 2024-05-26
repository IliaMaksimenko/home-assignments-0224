package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

/**
 * Класс для проверки класса NodImpl.
 */
public class NodTest {
    /**
     * Вызываем экземпляр класса.
     */
    NodImpl nod = new NodImpl();

    /**
     * Проверяем метод calculate.
     */
    @Test
    public void nodTest() {
        Assert.assertEquals(2, nod.calculate(2, 4));
        Assert.assertEquals(5, nod.calculate(5, 25));
        Assert.assertEquals(20, nod.calculate(20, 100));
        Assert.assertEquals(10, nod.calculate(-10, 100));
    }

    /**
     * Проверяем метод calculate негативным результатом.
     */
    @Test(expected = AssertionError.class)
    public void nodNegativeTest() {
        Assert.assertEquals(5, nod.calculate(20, 100));
    }
}
