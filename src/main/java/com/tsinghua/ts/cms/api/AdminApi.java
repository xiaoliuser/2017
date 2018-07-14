/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.tsinghua.ts.cms.api;

import com.tsinghua.ts.cms.vo.AdminForFindAdminReqVo;
import com.tsinghua.ts.cms.vo.AdminForFindAdminResVo;
 

public interface AdminApi {
 
	 
	/**
	 * 查询后台管理员数据
	 * @param reqVo
	 * @return AdminForFindAdminResVo
	 */
	public AdminForFindAdminResVo findAdmin(AdminForFindAdminReqVo reqVo);
	
	

	
	
}
