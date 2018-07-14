package com.tsinghua.ts.cms.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AuditVo implements Serializable {

  	 private static final long serialVersionUID = 1L;
  	 /**审核编号**/
	 private Long auditId;
  	 /**订单编号**/
	 private Long orderId;
	 /**客户编号**/
	 private Long customerId;
	 /**手机号码**/
	 private String phone;
	 /**审核人**/
	 private Long adminId;
	 /**审核时间**/
	 private String auditTime;
	 /**审核状态  10:通过  20：不通过 **/
	 private Integer status;
	 /**审核内容 **/
	 private String auditContent;
	 

}