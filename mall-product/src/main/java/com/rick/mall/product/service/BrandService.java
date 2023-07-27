package com.rick.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.mall.common.utils.PageUtils;
import com.rick.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-07-27 05:17:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

