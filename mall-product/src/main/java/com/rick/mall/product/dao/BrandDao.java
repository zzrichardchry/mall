package com.rick.mall.product.dao;

import com.rick.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-07-27 05:17:08
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
