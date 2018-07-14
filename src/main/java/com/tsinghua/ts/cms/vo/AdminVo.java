package com.tsinghua.ts.cms.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AdminVo implements Serializable {

  	 private static final long serialVersionUID = 1L;
  	 /**管理员编号**/
	 private String adminId;
	 /**管理员名称**/
	 private String adminName;
	 /**管理员密码**/
	 private String password;
	 /**手机号码**/
	 private String tel;

}