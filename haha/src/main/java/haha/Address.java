package haha;

public class Address {

	@Override
	public String toString() {
		return "Address [jiedao=" + jiedao + ", menpai=" + menpai
				+ ", fanghao=" + fanghao + "]";
	}

	private String jiedao = "�����Ŵ��";
	
	private String menpai = "5";
	
	private String fanghao = "202";

	public String getJiedao() {
		return jiedao;
	}

	public void setJiedao(String jiedao) {
		this.jiedao = jiedao;
	}

	public String getMenpai() {
		return menpai;
	}

	public void setMenpai(String menpai) {
		this.menpai = menpai;
	}

	public String getFanghao() {
		return fanghao;
	}

	public void setFanghao(String fanghao) {
		this.fanghao = fanghao;
	}
	
	
}
