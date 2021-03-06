package cn.lemon.framework.core;

import java.io.Serializable;

import cn.lemon.framework.utils.JsonUtil;

/**
 * 数据传输基类
 * @date 2017年8月5日 下午2:14:20 <br>
 * @author lonyee
 */
public abstract class BasicDtoBean implements Serializable {
	
	private static final long	serialVersionUID	= -6466964376068440943L;
	
	public BasicDtoBean() {}
	
	@Override
    public String toString() {
		return JsonUtil.writeValue(this);
    }
}
