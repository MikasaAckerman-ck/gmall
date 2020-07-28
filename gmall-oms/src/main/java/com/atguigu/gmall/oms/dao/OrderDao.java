package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ck
 * @email 1103700768@qq.com
 * @date 2020-07-28 21:34:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
