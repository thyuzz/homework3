package org.example.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Main {
    public static void main(String[] args) {
        ItemsInfo item1 = new ItemsInfo("товар1", "Россия", 51, 100, 1);
        ItemsInfo item2 = new ItemsInfo("товар2", "Россия", 41, 120, 2);
        ItemsInfo item3 = new ItemsInfo("товар3", "Белоруссия", 75, 130, 3);
        ItemsInfo item4 = new ItemsInfo("товар4", "Казахстан", 65, 120, 2);
        ItemsInfo item5 = new ItemsInfo("товар5", "Узбекистан", 80, 110, 3);
        ItemsInfo item6 = new ItemsInfo("товар6", "Китай", 25, 100, 1);
        ItemsInfo item7 = new ItemsInfo("товар7", "Китай", 63, 126, 3);
        ItemsInfo item8 = new ItemsInfo("товар8", "Китай", 11, 110, 3);

        List<ItemsInfo> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);

        Integer minPrice = 1000;
        Integer sort = 3;
        Byte k = 0;

        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getVariety() == sort) {
                if (itemsList.get(i).getPrice() < minPrice) {minPrice = itemsList.get(i).getPrice();}
            }
        }

        for (int i = 0; i < itemsList.size(); i++) {
            if ((itemsList.get(i).getPrice() == minPrice) && (itemsList.get(i).getVariety() == sort)){
                System.out.println(itemsList.get(i).getName());
                k++;
            }
        }

        if (k == 0) {System.out.println("Товаров для заданных условий нет");}

    }

}
