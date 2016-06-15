package com.rainbow.entity;

/**
 * Created by rainbow on 2016/6/15.
 * 每天进步一小步
 */
//定义商品的包装对象
public class ItemsQueryVo {
private Items items;
    private ItemsCustomer itemsCustomer;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustomer getItemsCustomer() {
        return itemsCustomer;
    }

    public void setItemsCustomer(ItemsCustomer itemsCustomer) {
        this.itemsCustomer = itemsCustomer;
    }
}
