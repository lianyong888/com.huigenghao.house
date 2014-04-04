package com.huigenghao.house.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huigenghao.service.TestQueryService;

/**
 * 首页
 * @author luoweijun
 */
@Controller
public class HomeControl {
	@Autowired
	@Qualifier("testQueryService")
	TestQueryService testQueryService;

	@RequestMapping("/home")
	public String index(HttpServletRequest request) {
		request.setAttribute("columnList", testQueryService.test());
		return "/userspace/homeSpace_ftl";
	}

	@RequestMapping("/index")
	public String indexJsp(HttpServletRequest request) {
		request.setAttribute("columnList", testQueryService.test());
		return "/userspace/homeSpace_jsp";
	}
}
