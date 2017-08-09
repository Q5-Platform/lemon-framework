package cn.lemon.framework.core;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.lemon.framework.response.ResultResponse;

public class BasicController {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;
	
	/**
	 * 获取用户ID
	 */
	protected Long getUserId() {
		Long userId = (Long) request.getAttribute("userId");
		return userId!=null ? userId: -1L;
	}
	
	/** 返回结果集 */
	protected ResultResponse resultResponse = new ResultResponse();

	/** Token名称 */
	protected final static String TOKEN = "x-auth-token";
}
