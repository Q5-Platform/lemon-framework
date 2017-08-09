package cn.lemon.framework.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.lemon.framework.utils.SerialNumberUtil;
import cn.lemon.framework.utils.SerialUUIDUtil;

/**
 * 基础服务类
 * @date 2017年8月8日 下午3:55:28 <br>
 * @author lonyee
 */
public abstract class BasicService {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 生成唯一ID 19位
	 */
	public Long generateId() {
		return SerialNumberUtil.instance().nextId();
	}
	
	/**
	 * 生成唯一UUID 32位
	 */
	public String generateUUId() {
		return SerialUUIDUtil.instance().nextId();
	}
	
	/**
	 * 生成短UUID 12位
	 */
	public String generateShortUUId() {
		return SerialUUIDUtil.instance().nextShortId();
	}
}
