package edu.icet.service;

import edu.icet.dto.Item;

import java.util.List;

public interface ItemService {
    void addItem(Item item);

    List<Item> getAllItems();

    void UpdateItem(Item item);

    void deleteItem(Integer id);

    Item findByItemCode(String itemCode);
}
