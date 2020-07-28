package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ck
 * @email 1103700768@qq.com
 * @date 2020-07-28 18:59:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
