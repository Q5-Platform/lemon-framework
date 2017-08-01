package cn.lemon.framework.core;

import java.io.Serializable;

import cn.lemon.framework.utils.BeanUtil;
import cn.lemon.framework.utils.JsonUtil;

public abstract class BasicDtoBean implements Serializable {
	
	private static final long	serialVersionUID	= -6466964376068440943L;
	
	public BasicDtoBean() {}
	public <I> BasicDtoBean(BasicEntityBean<I> entityBean) {
		BeanUtil.toBeanValues(entityBean, this);
	}

	public <T extends BasicEntityBean<I>, I> T toEntityBean(Class<T> entityClazz) {
		return BeanUtil.toBeanValues(this, entityClazz);
	}

	@Override
    public String toString() {
		return JsonUtil.writeValue(this);
    }
}
