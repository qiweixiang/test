package haha;

import java.util.Date;

public class TimeTest {

	@Override
	public String toString() {
		return "TimeTest [getVo()=" + getVo() + ", getDate()=" + getDate();
				
	}
	private String vo;
	private Date date;
	public String getVo() {
		return vo;
	}
	public void setVo(String vo) {
		this.vo = vo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
