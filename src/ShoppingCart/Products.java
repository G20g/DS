package ShoppingCart;

import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.List;

public class Products {
    HashMap<String,String> avail_products_category = new HashMap<>();
    HashMap<String,Double> avail_products_cost=new HashMap<>();
    Products()
    {
        avail_products_category.put("jam","Organic");
        avail_products_category.put("corn flakes","Organic");
        avail_products_category.put("adidas shoes","Luxury");
        avail_products_category.put("rollex watch","Luxury");
        avail_products_category.put("butter","Organic");
        avail_products_category.put("t-shirt","Other");
        avail_products_category.put("nike shoes","Luxury");
        avail_products_category.put("pencil","Other");
        avail_products_category.put("notebook","Other");
        avail_products_category.put("earphone","Other");
        avail_products_cost.put("jam", (double) 200);
        avail_products_cost.put("corn flakes", (double) 500);
        avail_products_cost.put("adidas shoes", (double) 2000);
        avail_products_cost.put("rollex watch", (double) 15000);
        avail_products_cost.put("butter", (double) 300);
        avail_products_cost.put("t-shirt", (double) 500);
        avail_products_cost.put("nike shoes", (double) 1500);
        avail_products_cost.put("pencil", (double) 10);
        avail_products_cost.put("notebook", (double) 50);
        avail_products_cost.put("earphone", (double) 200);
    }
    void displayProducts()
    {
        System.out.println("Available Products are-:");
        System.out.println("Product=Cost(Rs.)");
        System.out.println(avail_products_cost);
    }
    HashMap<String,Integer> tax=new HashMap<>();
    int getTax(String str)
    {
        tax.put("Organic",5);
        tax.put("Other",10);
        tax.put("Luxury",15);
        return tax.get(avail_products_category.get(str));
    }
    HashMap<String,String> criteria=new HashMap<>();
    String crt(String str)
    {
        criteria.put("Organic","1 Day");
        criteria.put("Other","Non-Refundable");
        criteria.put("Luxury","30 days") ;
        return criteria.get(avail_products_category.get(str));
    }


}
