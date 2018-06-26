package haha;

import java.util.List;

import com.jd.jshop.kepler.inter.client.shop.vo.CouponVO;

public class CouponList {

	private List<CouponVO> data;
	public List<CouponVO> getData() {
		return data;
	}

	public void setData(List<CouponVO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CouponList [getData()=" + getData();
	}
	
	
}
