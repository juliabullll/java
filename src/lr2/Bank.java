package lr2;

// Интерфейс для банковского счета
interface BankAccountInterface {
    void createAccount(String accountNumber, String accountHolder, double initialBalance);
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountInfo();
}

// Класс банковского счета
class BankAccount implements BankAccountInterface {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Конструктор
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void createAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        System.out.println("Счет создан: " + accountNumber);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + " руб. Текущий баланс: " + balance + " руб.");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Снято: " + amount + " руб. Текущий баланс: " + balance + " руб.");
            } else {
                System.out.println("Ошибка: недостаточно средств");
            }
        } else {
            System.out.println("Ошибка: сумма должна быть положительной");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountInfo() {
        return "Счет: " + accountNumber + ", Владелец: " + accountHolder + ", Баланс: " + balance + " руб.";
    }
}

// Главный класс для запуска
public class Bank {
    public static void main(String[] args) {
        System.out.println("Работа с банковскими счетами\n");

        // Создаем первый счет
        System.out.println("Счет 1");
        BankAccount account1 = new BankAccount("123456", "Иван Петров", 1000);
        System.out.println(account1.getAccountInfo());

        // Операции со счетом 1
        account1.deposit(500);
        account1.withdraw(200);
        account1.withdraw(2000); // Попытка снять больше, чем есть

        System.out.println();

        // Создаем второй счет
        System.out.println("Счет 2");
        BankAccount account2 = new BankAccount("789012", "Мария Иванова", 5000);
        System.out.println(account2.getAccountInfo());

        // Операции со счетом 2
        account2.deposit(1000);
        account2.withdraw(3000);

        System.out.println();

        // Итоговая информация
        System.out.println("Итог");
        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());

        System.out.println("\nОбщий баланс: " + (account1.getBalance() + account2.getBalance()) + " руб.");
    }
}
