package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author ck
 * @email 1103700768@qq.com
 * @date 2020-07-28 21:24:56
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

