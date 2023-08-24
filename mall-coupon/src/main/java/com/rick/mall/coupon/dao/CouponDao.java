package com.rick.mall.coupon.dao;

import com.rick.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 16:39:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
