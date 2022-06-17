import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
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
                workWithProducts();
            } else if (mainMenuItem == 2) {
                workWithStorages();
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
            }
        }
    }

    private static void workWithProducts() {
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
            if (mainMenuItem == 1) {
                AddingGoodsToTheWarehouse();
            } else if (mainMenuItem == 2) {
                AddingManyGoodsToTheWarehouse();
            }
            else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в предыдущее меню...");
                break;
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
            if(mainMenuItem == 1){

            }
            else if(mainMenuItem == 2){

            }
            else if(mainMenuItem == 3){

            }
            else if(mainMenuItem == 0){
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в предыдущее меню...");
                break;
            }
        }
    }

    public static void AddingGoodsToTheWarehouse() {
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock(50);
        Stock stock2 = new Stock(50);
        Stock stock3 = new Stock(50);
        stocks.add(0, stock1);
        stocks.add(1, stock2);
        stocks.add(2, stock3);
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
                System.out.println("    2) Введите объём Шампуня");
                System.out.print("Ввод:");
                int shampooVolume = scanner.nextInt();
                ArrayList<ShampooBox> shampooBox = new ArrayList<>();
                shampooBox.add(0, new ShampooBox("Шампунь", shampooName, 3, shampooVolume));
                if (mainMenuStock == 1) {
                    stock1.setValume(stock1.getValume() - shampooBox.get(0).getVolume());
                } else if (mainMenuStock == 2) {
                    stock2.setValume(stock2.getValume() - shampooBox.get(0).getVolume());
                } else if (mainMenuStock == 3) {
                    stock3.setValume(stock3.getValume() - shampooBox.get(0).getVolume());
                }
                System.out.println(shampooBox.toString());
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
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
                ArrayList<SoapBox> soapBox = new ArrayList<>();
                soapBox.add(0, new SoapBox("Мыло", soapName, 3, soapWeight));
                if (mainMenuStock == 1) {
                    stock1.setValume(stock1.getValume() - soapBox.get(0).getVolume());
                } else if (mainMenuStock == 2) {
                    stock2.setValume(stock2.getValume() - soapBox.get(0).getVolume());
                } else if (mainMenuStock == 3) {
                    stock3.setValume(stock3.getValume() - soapBox.get(0).getVolume());
                }
                System.out.println(soapBox.toString());
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
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
                ArrayList<DrinksBox> drinksBoxes = new ArrayList<>();
                if (mainMenuStock == 1) {
                    drinksBoxes.add(0, new DrinksBox("Напиток", drinkName, 5, drinkVolume));
                    stock1.setValume(stock1.getValume() - drinksBoxes.get(0).getVolume());
                } else if (mainMenuStock == 2) {
                    stock2.setValume(stock2.getValume() - drinksBoxes.get(0).getVolume());
                } else if (mainMenuStock == 3) {
                    stock3.setValume(stock3.getValume() - drinksBoxes.get(0).getVolume());
                }
                System.out.println(drinksBoxes.toString());
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
                break;
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в предыдущее меню...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");

            }
            System.out.println("Ошибка. Введите цифру из меню!!!");
        }
    }

    public static void AddingManyGoodsToTheWarehouse() {
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock(50);
        Stock stock2 = new Stock(50);
        Stock stock3 = new Stock(50);
        stocks.add(0, stock1);
        stocks.add(1, stock2);
        stocks.add(2, stock3);
        while (true) {
            int mainMenuItem;
            int mainMenuStock;
            System.out.println("Введите количество коробок для добавления на склад");
            System.out.print("Ввод:");
            int howManyBox = scanner.nextInt();
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
                System.out.println("    2) Введите объём Шампуня");
                System.out.print("Ввод:");
                int shampooVolume = scanner.nextInt();
                for (int i = 0; i < howManyBox; i++) {
                    ArrayList<ShampooBox> shampooBox = new ArrayList<>();
                    shampooBox.add(0, new ShampooBox("Шампунь", shampooName, 3, shampooVolume));
                    if (mainMenuStock == 1) {
                        stock1.setValume(stock1.getValume() - shampooBox.get(0).getVolume());
                    } else if (mainMenuStock == 2) {
                        stock2.setValume(stock2.getValume() - shampooBox.get(0).getVolume());
                    } else if (mainMenuStock == 3) {
                        stock3.setValume(stock3.getValume() - shampooBox.get(0).getVolume());
                    }
                    System.out.println(shampooBox.toString());
                }
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
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
                for (int i = 0; i < howManyBox; i++) {
                    ArrayList<SoapBox> soapBox = new ArrayList<>();
                    soapBox.add(0, new SoapBox("Мыло", soapName, 3, soapWeight));
                    if (mainMenuStock == 1) {
                        stock1.setValume(stock1.getValume() - soapBox.get(0).getVolume());
                    } else if (mainMenuStock == 2) {
                        stock2.setValume(stock2.getValume() - soapBox.get(0).getVolume());
                    } else if (mainMenuStock == 3) {
                        stock3.setValume(stock3.getValume() - soapBox.get(0).getVolume());
                    }
                    System.out.println(soapBox.toString());
                }
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
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
                for (int i = 0; i < howManyBox; i++) {
                    ArrayList<DrinksBox> drinksBoxes = new ArrayList<>();
                    drinksBoxes.add(0, new DrinksBox("Напиток", drinkName, 5, drinkVolume));
                    if (mainMenuStock == 1) {
                        stock1.setValume(stock1.getValume() - drinksBoxes.get(0).getVolume());
                    } else if (mainMenuStock == 2) {
                        stock2.setValume(stock2.getValume() - drinksBoxes.get(0).getVolume());
                    } else if (mainMenuStock == 3) {
                        stock3.setValume(stock3.getValume() - drinksBoxes.get(0).getVolume());
                    }
                    System.out.println(drinksBoxes.toString());
                }
                System.out.println("Место на 1 складе: " + stock1.getValume());
                System.out.println("Место на 2 складе: " + stock2.getValume());
                System.out.println("Место на 3 складе: " + stock3.getValume());
                break;
            } else if (mainMenuItem == 0) {
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в предыдущее меню...");
                System.out.println("-------------------------------------------------------------");

            }
            System.out.println("Ошибка. Введите цифру из меню!!!");
        }
    }
}
