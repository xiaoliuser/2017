/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package com.tsinghua.ts.cms.vo;

import com.tsinghua.ts.common.vo.ReqVo;

import lombok.Getter;
import lombok.Setter;

/**   
 * 线下金店请求Vo
 *
 * @version 2018年4月27日 上午10:29:37 
 * @author lichunlin   
*/
@Setter
@Getter
public class UpdateAuditStatusReqVo extends ReqVo{
   
	private static final long serialVersionUID = 1L;
     
 	/**订单编号**/
	private Long orderId;
	 
    /**审核状态  10:通过  20：不通过 **/
    private Integer status;
    

    
}
