package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[] {

                new Employee("Иванов Иван", "инженер", "ivaniv@gmail.ru",
                        2634578, 50000, 30),
                new Employee("Петров Петр", "сторож", "petrpet@gmail.ru",
                        2865231, 20000, 46),
                new Employee("Смирнов Саша", "физрук", "sashasm@gmail.ru",
                        2789632, 30000, 35),
                new Employee("Пупкин Вася", "лоботряс", "pupok@gmail.ru",
                        2456987, 15000, 41),
                new Employee("Техник Миша", "фрилансер", "techo@gmail.ru",
                        29777666, 150000, 27),

        };
        for (Employee employee: employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}