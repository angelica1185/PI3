package pips.com.pe.library;

public class CustomMessageException extends Exception{
	
	private static final long serialVersionUID = 1L;

	private CodeError errCode;
	private String errMsg;

	public CodeError getErrCode() {
		return errCode;
	}

	public void setErrCode(CodeError errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public CustomMessageException(CodeError errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public CustomMessageException(String errMsg) {
		this.errMsg = errMsg;
	}

}
