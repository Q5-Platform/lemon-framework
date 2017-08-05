package cn.lemon.framework.core;

import java.io.Serializable;
import java.util.Date;

import cn.lemon.framework.utils.JsonUtil;
import cn.lemon.framework.utils.SerialNumberUtil;
import cn.lemon.framework.utils.SerialUUIDUtil;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.Objects;

/**
 * <p>
 * 实体模型的基类(实现了序列化接口),
 * 所有的Domain对象都需要从BasicEntityBean继承
 * </p>
 *
 * @author lonyee
 * @date 2016-07-14
 */
public abstract class BasicEntityBean<I> implements Serializable {
    
	private static final long serialVersionUID = -1394178167652755500L;
	public BasicEntityBean() {}
	
	/** 主键id */
    private I id;
    /** 是否可用（软删除使用）  */
    private Boolean usable = true;
    /** 创建人员 **/
    private Long creator;
    /** 创建时间 **/
    private Date createdDate;
    
    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

	public Boolean getUsable() {
		return usable;
	}

	public void setUsable(Boolean usable) {
		this.usable = usable;
	}
	public Long getCreator() {
		return creator;
	}
	public void setCreator(Long creator) {
		this.creator = creator;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
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
	
	@Override
    public String toString() {
		return JsonUtil.writeValue(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("rawtypes")
		BasicEntityBean that = (BasicEntityBean) o;
        return Objects.equal(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
