package com.bnp.mytest.basket;

import com.bnp.mytest.models.BasketItems;
import com.bnp.mytest.models.Book;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<BasketItems> cartItems = new ArrayList<>();
   

    public void add(Book book) {

        BasketItems existed = null;

        for (BasketItems item:cartItems){
            if (item.getBook().equals(book))
                existed = item;
        }

        if (existed != null)
            existed.changeQuantity(existed.getQuantity() + 1);
        else
            cartItems.add(new BasketItems(book, 1));
    }


}
