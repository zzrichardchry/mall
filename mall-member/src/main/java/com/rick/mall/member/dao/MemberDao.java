package com.rick.mall.member.dao;

import com.rick.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Rick
 * @email rick@gmail.com
 * @date 2023-08-24 17:05:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
