package ShoppingCart;
import javax.swing.text.Document;
import java.util.*;

public class Cart extends Products {
    private Map<String,Integer> cartitems=new HashMap<>();
    private int qty;
    List<String> list=new ArrayList<>();

    Cart()
    {
        super();
    }
    void add(String str, int qty)
    {
        if(cartitems.get(str)==null)
        {
            cartitems.put(str,qty);
            System.out.println("Typeof product is "+avail_products_category.get(str)+" and cost is "+avail_products_cost.get(str));
            System.out.println("Criteria of Return is "+crt(str));
            if(list.contains(str)==false)
            list.add(str);
        }
        else
        {
            int c=cartitems.get(str);
            cartitems.put(str,qty + c);
        }
    }
    void remove(String str, int qty)
    {
        if(cartitems.get(str)==null){
            System.out.println("This Item is not in your cart");
        }
        else {
            int c = cartitems.get(str);
            cartitems.put(str, c - qty);
            if (c - qty == 0) {
                list.remove(str);
            }
        }
    }
    void showCart()
    {
        System.out.println("Your Cart Is-:");
        System.out.println("Product=Qty");
        System.out.println(cartitems);
        System.out.println(list);
    }
    Double getbill()
    {
        double bill=0;
        for(int i=0;i<list.size();i++)
        {
            int count=cartitems.get(list.get(i));
            double cop=avail_products_cost.get(list.get(i));
            double tax=getTax(list.get(i));
            bill=bill+(cop*count)+((tax/100)*(cop));
        }
        return bill;

    }

}
