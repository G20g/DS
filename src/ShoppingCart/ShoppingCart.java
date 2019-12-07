package ShoppingCart;

import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("!----SHOPPING CART----!");
        Products p=new Products();
        p.displayProducts();
        int n=0;
        Cart cart = new Cart();
        while(n!=5) {
            System.out.println("\nPress Below Options-:");
            System.out.println("1. To Add Products");
            System.out.println("2. To Remove Products");
            System.out.println("3. To Show Cart");
            System.out.println("4. To Get Bill");
            System.out.println("5. To Exit");
            n = s.nextInt();
            s.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Enter Product Name");
                    String str = s.nextLine();
                    System.out.println("Quantity of Product to be add to cart");
                    int qty = s.nextInt();
                    cart.add(str, qty);
                    break;
                case 2:
                    System.out.println("Enter Product Name");
                    String str1 = s.nextLine();
                    System.out.println("Quantity of Product to be add to cart");
                    int qtyr = s.nextInt();
                    cart.remove(str1, qtyr);
                    break;
                case 3:
                    cart.showCart();
                    break;
                case 4:
                    System.out.print("Tota Bill is ");
                    System.out.println(cart.getbill());
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }
}