package com.rainbow.mapper;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/15.
 * 每天进步一小步
 */
public interface ItemsMapperCustomer {
    /**
     * 商品列表查询
     */
    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
