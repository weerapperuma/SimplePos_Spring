package lk.ijse.dto.impl;

import lk.ijse.springpos.customObj.ItemResponse;
import lk.ijse.springpos.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO implements SuperDTO, ItemResponse {
    private String code;
    private String name;
    private Double price;
    private int qty;
}
