import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Food> cartItems = new ArrayList<>();

    public Cart() {

    }

    public List<Food> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Food> cartItems) {
        this.cartItems = cartItems;
    }

    public void addToCart(Food food){
        cartItems.add(food);
    }

    public void removeFromCart(Food food) throws Exception {
        if (cartItems.isEmpty()){
            throw new Exception();
        }
        cartItems.remove(food);
    }
}
