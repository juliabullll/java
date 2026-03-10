package lr2;

// Базовый класс Animal
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Подкласс Dog
class Dog extends Animal {
    private String breed;
    private String foodType;

    public Dog(String name, int age, String breed, String foodType) {
        super(name, age);
        this.breed = breed;
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }

    public void fetch() {
        System.out.println(name + " приносит палку");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed + ", Корм: " + foodType);
    }
}

// Подкласс Cat
class Cat extends Animal {
    private String breed;
    private String foodType;

    public Cat(String name, int age, String breed, String foodType) {
        super(name, age);
        this.breed = breed;
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    public void climb() {
        System.out.println(name + " залезает на дерево");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed + ", Корм: " + foodType);
    }
}

// Подкласс Bird
class Bird extends Animal {
    private boolean canFly;
    private String foodType;

    public Bird(String name, int age, boolean canFly, String foodType) {
        super(name, age);
        this.canFly = canFly;
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Чирик-чирик!");
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " летает");
        } else {
            System.out.println(name + " не умеет летать");
        }
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Умеет летать: " + (canFly ? "Да" : "Нет") + ", Корм: " + foodType);
    }
}

// Класс для запуска
class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Тест\n");

        // Создаем собаку
        System.out.println("Собака");
        Dog dog = new Dog("Шарик", 3, "Овчарка", "Сухой корм");
        dog.displayInfo();
        dog.makeSound();
        dog.fetch();

        System.out.println();

        // Создаем кошку
        System.out.println("Кошка");
        Cat cat = new Cat("Мурка", 2, "Сиамская", "Рыба");
        cat.displayInfo();
        cat.makeSound();
        cat.climb();

        System.out.println();

        // Создаем птицу
        System.out.println("Птица");
        Bird bird = new Bird("Кеша", 1, true, "Зерно");
        bird.displayInfo();
        bird.makeSound();
        bird.fly();

        System.out.println();

        // Создаем нелетающую птицу
        System.out.println("Пингвин");
        Bird penguin = new Bird("Пингвин", 5, false, "Рыба");
        penguin.displayInfo();
        penguin.makeSound();
        penguin.fly();
    }
}
