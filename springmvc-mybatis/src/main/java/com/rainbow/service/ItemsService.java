package com.rainbow.service;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/15.
 * 每天进步一小步
 */
public interface ItemsService {
    /**
     * 商品查询列表
     */
    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;


}
