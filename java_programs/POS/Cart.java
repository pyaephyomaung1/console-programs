package POS;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getItem().getProductName().equals(item.getProductName())) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(item, quantity));
    }
    public void viewCart(){
        for (CartItem cartItem : cartItems) {
            System.out.println("Product: " + cartItem.getItem().getProductName() +
                    ", Quantity: " + cartItem.getQuantity() +
                    ", Total Price: " + cartItem.getTotalPrice());
        }
    }
    public double calculateTotal(){
        double total = 0;
        for (CartItem cartItem : cartItems) {
            total += cartItem.getTotalPrice();
        }
        return total;
    }
    public void clearCart() {
        cartItems.clear();
    }
}
