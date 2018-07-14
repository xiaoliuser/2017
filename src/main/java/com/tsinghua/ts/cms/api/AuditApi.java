/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.tsinghua.ts.cms.api;

import com.tsinghua.ts.cms.vo.AuditForFindAuditReqVo;
import com.tsinghua.ts.cms.vo.AuditForFindAuditResVo;
import com.tsinghua.ts.cms.vo.UpdateAuditStatusReqVo;
import com.tsinghua.ts.cms.vo.UpdateAuditStatusResVo;

public interface AuditApi {
 
	 
	/**
	 * 查询订单审核数据
	 * @param reqVo
	 * @return AuditForFindAuditResVo
	 */
	public AuditForFindAuditResVo findAudit(AuditForFindAuditReqVo reqVo);
	
	
	/**
	 * 根据订单编号修改订单的审核的状态
	 * 同一时刻只允许一个线程操作
	 * @param reqVo
	 * @return UpdateAuditStatusResVo
	 */
	public UpdateAuditStatusResVo updateAuditStatus(UpdateAuditStatusReqVo reqVo);
	
	

	
	
}
