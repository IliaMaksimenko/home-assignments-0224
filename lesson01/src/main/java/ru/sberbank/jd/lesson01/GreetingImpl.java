package ru.sberbank.jd.lesson01;

import java.util.Arrays;
import java.util.Collection;

/**
 * Проверяем имя.
 */
public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Илья";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Максименко";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 1991;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
        return Arrays.asList("Автомобили", "Музыка", "Спорт", "Путешествия");
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/IliaMaksimenko/home-assignments-0224.git";
    }

    /**
     * Получение телефона.
     */
    @Override
    public String getPhone() {
        return "8-923-764-16-14";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return Arrays.asList("Возможность стать бэк-разработчиком", "Увеличение базы знаний");
    }

}
