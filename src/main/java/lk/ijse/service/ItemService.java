package lk.ijse.service;

import lk.ijse.customObj.ItemResponse;
import lk.ijse.dto.impl.ItemDTO;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);
    void deleteItem(String itemId);
    ItemResponse getSelectedItem(String itemId);
    List<ItemDTO> getAllItems();
}