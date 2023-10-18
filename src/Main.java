public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int monthlySavings = 15000;
        double deposit = 0;
        int months = 0;

        while (deposit < 2459000) {
            months++;
            deposit += monthlySavings;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Для накопления суммы " + deposit + " рублей понадобилось " + months + " месяцев");

        System.out.println("Задача 2");

        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (int year = 1; year <= 10; year++) {
            int birth = birthRate * population / 1000;
            int morta = mortalityRate * population / 1000;
            int grow = birth - morta;
            population += grow;
            System.out.println("Год" + year + " , численность населения составляет " + population);
        }
        System.out.println("Задача 4");

        int initialDeposit = 15000;
        int targetAmount = 12_000_000;
        int currentAmount = initialDeposit;
        int mon = 0;
        while (currentAmount < targetAmount) {
            mon++;
            currentAmount += initialDeposit;
            currentAmount *= 1.07;
            System.out.println("Месяцев потребуется " + mon + " накопления " + currentAmount);
        }
        System.out.println("Задача 5");
        int initialDeposit1 = 15000;
        int targetAmount1 = 12_000_000;
        int currentAmount1 = initialDeposit1;
        int mon1 = 0;
        while (currentAmount1 < targetAmount1) {
            mon1++;
            currentAmount1 += initialDeposit1;
            currentAmount1 *= 1.07;
            if (mon1 % 6 == 0) {
                System.out.println("Месяцев потребуется " + mon1 + " накопления " + currentAmount1);
            }
        }
        System.out.println("Задача 6");
        int initial = 15_000;
        int currentAmount2 = initial;
        for (int i = 1; i <= 108; i++) {
            currentAmount2 += initial;
            currentAmount2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накопления " + currentAmount2);
            }
        }
        System.out.println("Задача 7");
        int fridayDat = 5;
        int monch = 31;
        for (int r = fridayDat; r <= monch; r = r + 7) {
            System.out.println("Сегодня пятница " + r + "-e число. Подговить отчет. ");
        }
        System.out.println("Задача 8");

        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);


            }


        }
    }
}










