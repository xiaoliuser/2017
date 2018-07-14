package com.tsinghua.ts.cms.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class OrderVo implements Serializable {

  	 private static final long serialVersionUID = 1L;
  	 /**订单编号**/
	 private Long orderId;
	 /**客户编号**/
	 private Long customerId;
	 /**手机号码**/
	 private String phone;
	 /**创建时间**/
	 private String createTime;
	 /**订单状态  10：已申请  20：已受理 30:已下单 **/
	 private Integer status;
	 

}