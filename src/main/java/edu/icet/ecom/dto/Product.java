package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String id;
    private String name;
    private Integer qtyInStock;
    private Float discount;
    private Float price;
    private String category;
    private String description;
    private String size;
    private String imgPath;
}
