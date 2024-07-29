package samalex.programm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Product id_1 = new Product();
            String user_product = "";
            int money = 0;
            String user_term;
            String payment;
            System.out.print("Введите продукт который хотите купить: ");
            user_product = scanner.nextLine();
            Product.find_product(user_product);
            System.out.print("Прочитайте срок годности и введите его сюда: ");
            user_term = scanner.nextLine();
            Product.find_term(user_term);
            while(true) {
                    try {
                            System.out.print("Сколько у вас денег: ");
                            money = scanner.nextInt();
                            break;
                    } catch (Exception e) {
                            System.out.println("Это не деньги!");
                            scanner.nextLine();
                    }
            }
            Product.check_money(money);
            System.out.println("С вас " + Product.send_cost() + " рублей");
            System.out.println("Сами понимаете инфляция");
            System.out.print("Наличные/Карта: ");
            payment = scanner.nextLine();
            payment = scanner.nextLine();
            if(Product.CashRegister() == true)
            {
                System.out.println("Оплата прошла успешно!");
            }
            else {
                System.out.println("Походу у вас нет денег. УШЁЛ ПОКА МЕНТОВ НЕ ВЫЗВАЛ!!!");
        }
    }
}
