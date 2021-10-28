package com.bnp.mytest.utils;

import com.bnp.mytest.models.BasketItems;
import com.bnp.mytest.models.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BooksSetFactory {

    List<BooksSetDiscount> discounts;

    public BooksSetFactory(List<BooksSetDiscount> discounts){
        this.discounts = discounts;
    }

    public List<BooksSet> getDifferentBooksSetsWithMaxTotalDiscount(List<BasketItems> basketItems) {

        List<BooksSet> optimizeSetList;

        optimizeSetList = getBestCombinationBooksSets(basketItems);

        return optimizeSetList;
    }

    private List<BooksSet> getBestCombinationBooksSets(List<BasketItems> basketItems) {
        List<List<BooksSet>> differentBooksSetsCombinations = new ArrayList<>();
        List<BooksSet> optimizeSetList;

        optimizeSetList = differentBooksSetsCombinations.get(0);
        return optimizeSetList;
    }


}
