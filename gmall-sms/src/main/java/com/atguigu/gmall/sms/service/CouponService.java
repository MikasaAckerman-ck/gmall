package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author ck
 * @email 1103700768@qq.com
 * @date 2020-07-28 21:09:13
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

