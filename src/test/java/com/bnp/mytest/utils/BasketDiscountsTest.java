package com.bnp.mytest.utils;

import com.bnp.mytest.basket.Basket;
import com.bnp.mytest.basket.Price;
import com.bnp.mytest.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasketDiscountsTest {

    Basket basket;

    @BeforeEach
    public void setup(){
        List<BooksSetDiscount> differentCopiesDiscountList = new ArrayList<>();

        differentCopiesDiscountList.add(new BooksSetDiscount(2,5));
        differentCopiesDiscountList.add(new BooksSetDiscount(3,10));
        differentCopiesDiscountList.add(new BooksSetDiscount(4,20));
        differentCopiesDiscountList.add(new BooksSetDiscount(5,25));

        BooksSetFactory booksSetFactory = new BooksSetFactory(differentCopiesDiscountList);
        basket = new Basket(new Price(booksSetFactory));
    }

    @Test
    public void oneCopy(){
        //Given
        Book CleanCode = Catalog.GivenACleanCodeBook();
        //When
        basket.add(CleanCode);
        //Then
        assertThat(basket.getTotalPrice(), is(50.0));

    }


}
