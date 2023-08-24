package com.rick.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.mall.common.utils.PageUtils;
import com.rick.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:05:34
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

