package org.example.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    String name;
    String author;
    Integer price;
    Integer year;
    Integer pages;

}
