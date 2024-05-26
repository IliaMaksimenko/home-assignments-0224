package ru.sberbank.jd.lesson01;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

/**
 * Проверяем имя.
 */
public class GreetingTest {
    /**
     * Вызываем экземпляр класса.
     */
    GreetingImpl greeting = new GreetingImpl();

    /**
     * Проверяем имя.
     */
    @Test
    public void firstNameTest() {
        Assert.assertEquals(greeting.getFirstName(), "Илья");
    }

    /**
     * Проверяем фамилию.
     */
    @Test
    public void lastNameTest() {
        Assert.assertEquals(greeting.getLastName(), "Максименко");
    }

    /**
     * Проверяем год рождения.
     */
    @Test
    public void birthYearTest() {
        Assert.assertEquals(greeting.getBirthYear(), 1991);
    }

    /**
     * Проверяем список увлечений.
     */
    @Test
    public void hobbiesTest() {
        Collection<String> actualHobbies = greeting.getHobbies();
        Collection<String> expectedHobbies = Arrays.asList("Автомобили", "Музыка", "Спорт", "Путешествия");
        for (String hobby : expectedHobbies) {
            Assert.assertTrue(actualHobbies.stream().anyMatch(e -> e.equals(hobby)));
        }
    }

    /**
     * Проверяем ссылку на репозиторий проекта.
     */
    @Test
    public void repoUrlTest() {
        Assert.assertEquals(greeting.getRepoUrl(), "https://github.com/IliaMaksimenko/home-assignments-0224.git");
    }

    /**
     * Проверяем номер телефона.
     */
    @Test
    public void phoneTest() {
        Assert.assertEquals(greeting.getPhone(), "8-923-764-16-14");
    }

    /**
     * Проверяем список ожиданий от курса.
     */
    @Test
    public void courseExpectationsTest() {
        Collection<String> actualExpectations = greeting.getCourseExpectations();
        Collection<String> expectedExpectations =
                Arrays.asList("Возможность стать бэк-разработчиком", "Увеличение базы знаний");
        for (String hobby : expectedExpectations) {
            Assert.assertTrue(actualExpectations.stream().anyMatch(e -> e.equals(hobby)));
        }
    }
}
