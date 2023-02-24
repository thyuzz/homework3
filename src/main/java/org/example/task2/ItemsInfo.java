package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemsInfo {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer variety;
}


