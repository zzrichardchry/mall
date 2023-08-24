package com.rick.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.mall.common.utils.PageUtils;
import com.rick.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:18:49
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

