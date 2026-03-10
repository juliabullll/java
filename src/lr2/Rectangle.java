package lr2;

public class Rectangle {
    // Поля класса
    double length;
    double width;

    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Методы установки значений
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Методы получения значений
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Метод для вычисления площади
    public double getArea() {
        return length * width;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Главный метод для запуска
    public static void main(String[] args) {
        // Создаем прямоугольник
        Rectangle rect = new Rectangle(5, 3);

        // Выводим информацию
        System.out.println("Длина: " + rect.getLength());
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Площадь: " + rect.getArea());
        System.out.println("Периметр: " + rect.getPerimeter());

        // Меняем размеры
        rect.setLength(7);
        rect.setWidth(4);

        System.out.println("\nПосле изменения:");
        System.out.println("Длина: " + rect.getLength());
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Площадь: " + rect.getArea());
        System.out.println("Периметр: " + rect.getPerimeter());
    }
}
