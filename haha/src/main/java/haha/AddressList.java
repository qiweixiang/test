package haha;

import java.util.List;

public class AddressList {

	private List<Address> data;
	private String mam = "��";
	

	public List<Address> getData() {
		return data;
	}

	public void setData(List<Address> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "AddressList [data=" + data + "]";
	}
	
}
