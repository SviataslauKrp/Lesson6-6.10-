import computer.Computer;
import computer.HDD;
import computer.RAM;
import computer.Type;

import java.util.Scanner;

public class Main {

    // В первом задании суммы введены ручками в самом методе

    static Scanner console = new Scanner(System.in);
    static String exit;

    public static void main(String[] args) {

        System.out.println("Введите 1, если ходите проверить основное задание или 2 - если дополнительное.");

        while (!console.hasNextInt()) {
            System.out.println("Введите номер задания корректно");
            console.next();
        }
        int taskNumber = console.nextInt();

        while (taskNumber != 1 && taskNumber != 2) {
            System.out.println("Введите 1, если ходите проверить основное задание или 2 - если дополнительное.");
            while (!console.hasNextInt()) {
                System.out.println("Введите номер задания");
                console.next();
            }
            taskNumber = console.nextInt();
            if (taskNumber == 1 || taskNumber == 2) break;
        }

        switch (taskNumber) {
            case 1 -> mainTask();
            case 2 -> addTask();
        }

        console.close();
    }

    private static void addTask() {

        Computer computer1 = new Computer(1000, "Toshiba");
        computer1.getCompInformation();

        Computer computer2 = new Computer(2000, "Apple", new RAM("DDR1", 1024), new HDD(250, "SATA", Type.inner));
        computer2.getCompInformation();
    }

    private static void mainTask() {

        CreditCard creditCard1 = new CreditCard(100, 1000.);
        CreditCard creditCard2 = new CreditCard(101, 1500.);
        CreditCard creditCard3 = new CreditCard(102, 2000.);

        creditCard1.addAmount(-500.);
        creditCard2.addAmount(1000);
        creditCard3.withdrawAmount(1500);

    }
}