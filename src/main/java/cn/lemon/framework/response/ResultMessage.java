package cn.lemon.framework.response;

import java.io.Serializable;


/**
 * 返回消息伪枚举 - 使用时可以直接继承扩展
 * @author lonyee
 */
public class ResultMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 操作成功 */
	public static final ResultMessage SUCCESS = new ResultMessage(2000, "操作成功");
	/** 操作失败 */
	public static final ResultMessage FAILURE = new ResultMessage(4020, "操作失败");
	/** 服务器无法理解此请求 */
	public static final ResultMessage F4000 = new ResultMessage(4000, "服务器无法理解此请求");
	/** [服务器]运行时异常 */
	public static final ResultMessage F4001 = new ResultMessage(4001, "[服务器]运行时异常");
	/** [服务器]空值异常 */
	public static final ResultMessage F4002 = new ResultMessage(4002, "[服务器]空值异常");
	/** [服务器]数据类型转换异常 */
	public static final ResultMessage F4003 = new ResultMessage(4003, "[服务器]数据类型转换异常");
	/** [服务器]IO异常 */
	public static final ResultMessage F4004 = new ResultMessage(4004, "[服务器]IO异常");
	/** [服务器]未知方法异常 */
	public static final ResultMessage F4005 = new ResultMessage(4005, "[服务器]未知方法异常");
	/** [服务器]数组越界异常 */
	public static final ResultMessage F4006 = new ResultMessage(4006, "[服务器]数组越界异常");
	/** [服务器]网络异常 */
	public static final ResultMessage F4007 = new ResultMessage(4007, "[服务器]网络异常");
	/** 访问超时，请重新登陆 */
	public static final ResultMessage F4010 = new ResultMessage(401, "访问超时，请重新登陆");
	/** 不支持的媒体类型 */
	public static final ResultMessage F4150 = new ResultMessage(4150, "不支持的媒体类型");
	/** 没有页面访问权限 */
	public static final ResultMessage F4030 = new ResultMessage(403, "没有页面访问权限");
	/** 没有找到请求的接口资源 */
	public static final ResultMessage F4040 = new ResultMessage(4040, "没有找到请求的接口资源");
	/** 不支持的请求方法 GET,POST */
	public static final ResultMessage F4050 = new ResultMessage(4050, "不支持的请求方法");
	/** 客户端不接受所请求的 MIME类型 */
	public static final ResultMessage F4060 = new ResultMessage(4060, "客户端不接受所请求的MIME类型");
	/** 图片上传失败，请检查网络设置 */
	public static final ResultMessage F4070 = new ResultMessage(4070, "图片上传失败，请检查网络设置");
	/** 服务器内部异常 */
	public static final ResultMessage F5000 = new ResultMessage(5000, "服务器内部异常");
	
	private int code;
	private String message;
	protected ResultMessage(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
