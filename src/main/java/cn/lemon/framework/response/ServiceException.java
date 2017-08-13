package cn.lemon.framework.response;

/**
 * 异常处理类
 * @date 2017年8月8日 下午3:52:12 <br>
 * @author lonyee
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 6654830544228411564L;
	
	private ResultMessage errorMessage;
	
	public ResultMessage getResultMessage() {
		return errorMessage;
	}
	
	public int getErrorCode() {
		return errorMessage.getCode();
	}

	public void setErrorCode(ResultMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public ServiceException(){
		//Hessian序列化保留方式
		super(ResultMessage.FAILURE.getMessage());
		this.errorMessage = ResultMessage.FAILURE;
	}
	
	public ServiceException(ResultMessage errorMessage, Object... args){
		super(String.format(errorMessage.getMessage().contains("%s")? errorMessage.getMessage() : errorMessage.getMessage()+"，%s", args));
		this.errorMessage = new ResultMessage(errorMessage.getCode(), this.getMessage());
	}
	
	public ServiceException(ResultMessage errorMessage){
		super(errorMessage.getMessage());
		this.errorMessage = errorMessage;
	}
}
