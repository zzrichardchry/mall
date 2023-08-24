package com.rick.mall.ware.dao;

import com.rick.mall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:23:36
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
