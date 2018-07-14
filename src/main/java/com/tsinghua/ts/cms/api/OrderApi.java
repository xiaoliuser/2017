/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.tsinghua.ts.cms.api;

import com.tsinghua.ts.cms.vo.OrderForFindOrderReqVo;
import com.tsinghua.ts.cms.vo.OrderForFindOrderResVo;
import com.tsinghua.ts.cms.vo.UpdateOrderStatusForAcceptedReqVo;
import com.tsinghua.ts.cms.vo.UpdateOrderStatusForAcceptedResVo;

public interface OrderApi {
	 
	/**
	 * 查询订单数据
	 * @param reqVo
	 * @return OrderForFindOrderResVo
	 */
	public OrderForFindOrderResVo findOrder(OrderForFindOrderReqVo reqVo);
 
	 /**
	 * 修改订单状态，已受理
	 * 并发情况下，要根据此订单编号和此订单之前的状态，来修改新的状态
	 * @param reqVo
	 * @return UpdateOrderStatusForAcceptedResVo
	 */
     public UpdateOrderStatusForAcceptedResVo updateOrderStatusForAccepted(UpdateOrderStatusForAcceptedReqVo reqVo);
	

	
	
}
