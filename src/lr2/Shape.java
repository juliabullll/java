package lr2;

// Интерфейс для всех фигур
interface Main {
    double getArea();      // площадь
    double getPerimeter(); // периметр
}

// Класс Круг
class Circle implements Main {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Класс Квадрат
class Square implements Main {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

// Класс Треугольник (равносторонний)
class Triangle implements Main {
    double side;

    public Triangle(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}

public class Shape {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(6);

        // Вычисляем и выводим результаты для круга
        System.out.println("КРУГ");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getPerimeter());

        // Вычисляем и выводим результаты для квадрата
        System.out.println("\nКВАДРАТ");
        System.out.println("Сторона: " + square.getSide());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        // Вычисляем и выводим результаты для треугольника
        System.out.println("\nТРЕУГОЛЬНИК");
        System.out.println("Сторона: " + triangle.getSide());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());

        // Изменяем размеры
        circle.setRadius(10);
        square.setSide(7);
        triangle.setSide(9);

        System.out.println("\nПОСЛЕ ИЗМЕНЕНИЯ РАЗМЕРОВ");

        System.out.println("\nКРУГ");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getPerimeter());

        System.out.println("\nКВАДРАТ");
        System.out.println("Сторона: " + square.getSide());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        System.out.println("\nТРЕУГОЛЬНИК");
        System.out.println("Сторона: " + triangle.getSide());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}
