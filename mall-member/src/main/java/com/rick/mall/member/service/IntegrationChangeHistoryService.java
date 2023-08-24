package com.rick.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.mall.common.utils.PageUtils;
import com.rick.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:05:34
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

