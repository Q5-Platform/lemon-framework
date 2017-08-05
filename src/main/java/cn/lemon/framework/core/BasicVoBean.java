package cn.lemon.framework.core;

import java.io.Serializable;

import cn.lemon.framework.utils.JsonUtil;

/**
 * 界面传输数据基类
 * @date 2017年8月5日 下午2:15:07 <br>
 * @author lonyee
 */
public abstract class BasicVoBean implements Serializable {
	
	private static final long	serialVersionUID	= -6466964376068440943L;
	
	public BasicVoBean() {}

	@Override
    public String toString() {
		return JsonUtil.writeValue(this);
    }
}
