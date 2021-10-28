package com.bnp.mytest.basket;

import com.bnp.mytest.models.BasketItems;
import com.bnp.mytest.models.Book;
import com.bnp.mytest.utils.BooksSet;
import com.bnp.mytest.utils.BooksSetFactory;

import java.util.List;

public class Price implements PriceCalculator {

    private BooksSetFactory booksSetFactory;

    public Price(BooksSetFactory booksSetFactory){
        this.booksSetFactory = booksSetFactory;
    }

    @Override
    public Double calculate(List<BasketItems> basketItems) {
        List<BooksSet> setsOfDifferentBooks =
                booksSetFactory.getDifferentBooksSetsWithMaxTotalDiscount(basketItems);

        double totalPrice =0.0;
        return totalPrice;
    }
}
