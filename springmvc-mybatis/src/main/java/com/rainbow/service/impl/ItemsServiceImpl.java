package com.rainbow.service.impl;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;
import com.rainbow.mapper.ItemsMapperCustomer;
import com.rainbow.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by rainbow on 2016/6/15.
 * 每天进步一小步
 */
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustomer itemsMapperCustomer;

    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        //通过ItemsMapperCustomer查询数据库

        return itemsMapperCustomer.findItemsList(itemsQueryVo);
    }


}
