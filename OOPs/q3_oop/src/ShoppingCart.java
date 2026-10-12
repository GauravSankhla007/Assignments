import java.util.ArrayList;
public class ShoppingCart {
    ArrayList<Products> products = new ArrayList<>();


    void addProduct(Products product){
        products.add(product);
    }
    void removeProduct(Products product){
        products.remove(product);
    }
    double calculateTotal(){
        double total =0;
        for(int i = 0;i<products.size();i++){
            total += products.get(i).price * products.get(i).quantity;
        }
        return total;
    }
    void displayCart(){
        for(int i =0 ; i<products.size();i++){
            System.out.println(products.get(i).name);
            System.out.println(products.get(i).price);
            System.out.println(products.get(i).quantity);
        }

    }
}
