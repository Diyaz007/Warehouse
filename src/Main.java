import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock(50);
        Stock stock2 = new Stock(50);
        Stock stock3 = new Stock(50);
        stocks.add(0,stock1);
        stocks.add(1,stock2);
        stocks.add(2,stock3);
        ArrayList<ProductBox> ShampooBox = new ArrayList<>();



        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню:");
            System.out.println("    1) Работа с товарами");
            System.out.println("    2) Работа со складом");
            System.out.println("    0) Выход  из программы");
            System.out.print("Ввод:");
            mainMenuItem = scanner.nextInt();
            if (mainMenuItem == 1) {
                workWithProducts(stocks);
            } else if (mainMenuItem == 2) {
                workWithStorages();
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
            }
            System.out.println("Ошибка. Введите цифру из меню!!!");
        }
    }

    private static void workWithProducts(ArrayList<Stock> stocks) {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе с товарами");
            System.out.println("    1) Добавление товара на склад");
            System.out.println("    2) Добавление группы товаров на склад");
            System.out.println("    3) Удаление товара со склада");
            System.out.println("    4) Удаление группы товаров со склада");
            System.out.println("    5) Показать типы товаров и их количество");
            System.out.println("    0) Выход в главное меню");
            System.out.print("Ввод:");
            mainMenuItem = scanner.nextInt();
            if (mainMenuItem == 0) {
                break;
            } else if (mainMenuItem == 1) {
                AddingGoodsToTheWarehouse(stocks);
            } else if (mainMenuItem == 2) {

            }
        }

    }

    private static void workWithStorages() {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе со складами");
            System.out.println("    1) Показать список складов и товаров в них");
            System.out.println("    2) Добавть новый склад");
            System.out.println("    3) Удалить склад");
            System.out.println("    0) Выход в главное меню");
            System.out.print("Ввод:");
            mainMenuItem = scanner.nextInt();
        }
    }

    public static void AddingGoodsToTheWarehouse(ArrayList<Stock> stocks) {
        while (true) {
            int mainMenuItem;
            int mainMenuStock;
            System.out.println("    1) Добавление шампуня на склад");
            System.out.println("    2) Добавление мыло на склад");
            System.out.println("    3) Добавление напитка на склад");
            System.out.println("    0) Выход в главное меню");
            System.out.print("Ввод:");
            mainMenuItem = scanner.nextInt();
            if (mainMenuItem == 1) {
                System.out.println("Выберите склад для помещения товара");
                System.out.println("    1) Первый склад");
                System.out.println("    2) Второй склад");
                System.out.println("    3) Третий склад");
                System.out.print("Ввод:");
                mainMenuStock = scanner.nextInt();
                System.out.println("Информация о товаре:");
                System.out.println("    1) Введите название Шампуня");
                System.out.print("Ввод:");
                String shampooName = scanner.next();
                System.out.println("2) Введите объём Шампуня");
                System.out.print("Ввод:");
                int shampooVolume = scanner.nextInt();
                ShampooBox shampooBox = new ShampooBox("Шампунь", shampooName, 3, shampooVolume);
                if (mainMenuStock == 1) {
                    Stock1.setValume(Stock1.getValume() - shampooBox.getVolume());
                } else if (mainMenuStock == 2) {
                    Stock2.setValume(Stock2.getValume() - shampooBox.getVolume());
                } else if (mainMenuStock == 3) {
                    Stock3.setValume(Stock3.getValume() - shampooBox.getVolume());
                }
                System.out.println(shampooBox.toString());
                System.out.println(Stock1.getValume());
                System.out.println(Stock2.getValume());
                System.out.println(Stock3.getValume());
                break;
            } else if (mainMenuItem == 2) {
                System.out.println("Выберите склад для помещения товара");
                System.out.println("    1) Первый склад");
                System.out.println("    2) Второй склад");
                System.out.println("    3) Третий склад");
                System.out.print("Ввод:");
                mainMenuStock = scanner.nextInt();
                System.out.println("Информация о товаре:");
                System.out.println("    1) Введите название Мыла");
                System.out.print("Ввод:");
                String soapName = scanner.next();
                System.out.println("    2) Введите вес Мыла");
                System.out.print("Ввод:");
                int soapWeight = scanner.nextInt();
                SoapBox soapBox = new SoapBox("Мыло", soapName, 4, soapWeight);
                if (mainMenuStock == 1) {
                    Stock2.setValume(Stock1.getValume() - soapBox.getVolume());
                } else if (mainMenuStock == 2) {
                    Stock2.setValume(Stock2.getValume() - soapBox.getVolume());
                } else if (mainMenuStock == 3) {
                    Stock3.setValume(Stock3.getValume() - soapBox.getVolume());
                }
                System.out.println(soapBox.toString());
                break;
            } else if (mainMenuItem == 3) {
                System.out.println("Выберите склад для помещения товара");
                System.out.println("    1) Первый склад");
                System.out.println("    2) Второй склад");
                System.out.println("    3) Третий склад");
                System.out.print("Ввод:");
                mainMenuStock = scanner.nextInt();
                System.out.println("Информация о товаре:");
                System.out.println("    1) Введите название Напитка");
                System.out.print("Ввод:");
                String drinkName = scanner.next();
                System.out.println("    2) Введите объём Напитка");
                System.out.print("Ввод:");
                int drinkVolume = scanner.nextInt();
                DrinksBox drinksBox = new DrinksBox("Напиток", drinkName, 5, drinkVolume);
                if (mainMenuStock == 1) {
                    Stock3.setValume(Stock1.getValume() - drinksBox.getVolume());
                } else if (mainMenuStock == 2) {
                    Stock2.setValume(Stock2.getValume() - drinksBox.getVolume());
                } else if (mainMenuStock == 3) {
                    Stock3.setValume(Stock3.getValume() - drinksBox.getVolume());
                }
                System.out.println(drinksBox.toString());
                break;
            } else if (mainMenuItem == 0) {
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
            }
            System.out.println("Ошибка. Введите цифру из меню!!!");
        }
    }
}