package com.rick.mall.order.dao;

import com.rick.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:18:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
