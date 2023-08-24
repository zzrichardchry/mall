package com.rick.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.mall.common.utils.PageUtils;
import com.rick.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:05:34
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

