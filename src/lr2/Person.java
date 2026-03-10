package lr2;

public class Person {
    // Поля класса
    String name;
    int age;
    String gender;

    // Конструктор
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Методы установки значений
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Методы получения значений
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Главный метод для запуска
    public static void main(String[] args) {
        // Создаем человека
        Person person = new Person("Иван", 25, "мужской");

        // Выводим информацию
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        // Меняем возраст
        person.setAge(26);
        System.out.println("Новый возраст: " + person.getAge());
    }
}