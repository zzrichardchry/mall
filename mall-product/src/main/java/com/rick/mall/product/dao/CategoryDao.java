package com.rick.mall.product.dao;

import com.rick.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-07-27 05:17:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
