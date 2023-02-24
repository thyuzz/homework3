package org.example.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Высший товар", 100, 1);
        Items item2 = new Items("Хороший товар", 50, 1);
        Items item3 = new Items("Высший качественный товар", 90, 2);
        Items item4 = new Items("Обогощающий на высшем уровне товар", 120, 3);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        System.out.println(itemsList);
        Integer maxPrice = 0;
        String searchWord = "Высший";
        for (int i = 0; i < itemsList.size(); i++) {
            if ((itemsList.get(i).getName().indexOf(searchWord) == 0) &&
                ((itemsList.get(i).getVariety() == 1) || (itemsList.get(i).getVariety() == 2)) &&
                    (itemsList.get(i).getPrice() > maxPrice)){
                maxPrice = itemsList.get(i).getPrice();
            }
            
        }
        System.out.println(maxPrice);
    }
}