package samalex.programm;

import java.lang.Math;

public class Product {
    private static String name;
    private static String term;
    private static int cost;
    private static int user_money;

    public static void find_product(String user_product)
    {
        name = user_product;
    }

    public static void find_term(String user_term)
    {
        term = user_term;
    }
    public static void check_money(int money)
    {
        user_money = money;
    }

    public static int send_cost()
    {
        cost = (int) (20 + Math.random()*400);
        return cost;
    }

    public static boolean CashRegister()
    {
        if(user_money >= cost)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
