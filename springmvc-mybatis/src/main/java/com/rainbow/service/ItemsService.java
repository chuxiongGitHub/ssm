package com.rainbow.service;

import com.rainbow.entity.ItemsCustom;
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
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;


    /**
     * 根据ID查询商品信息
     */
    public ItemsCustom findItmesById(Integer id)throws Exception;
    /**
     * 修改商品信息
     */
    public void updteItems(Integer id,ItemsCustom itemsCustom)throws Exception;
}
