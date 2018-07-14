/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.tsinghua.ts.cms.vo;

import java.util.List;

import com.tsinghua.ts.common.vo.ResVo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminForFindAdminResVo extends ResVo{
 
	private static final long serialVersionUID = -4413616221977154073L;

	private List<AdminVo> admins;
 
 
}
