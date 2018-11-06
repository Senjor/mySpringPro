package com.zhiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 		laosun
* @version 		创建时间：2018年9月7日 上午10:58:37
* @ClassName 	类名称
* @Description 	类描述
*/
@Controller
public class LoginController {

	@RequestMapping(value="/index")
	public String login() {
		return "index";
	}
}
