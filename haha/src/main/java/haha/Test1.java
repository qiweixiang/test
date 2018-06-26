package haha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.jd.jshop.kepler.inter.client.shop.vo.CouponVO;

public class Test1 {

	public static void main(String[] args) {
		CouponList couponList = new CouponList();
		CouponVO couponVO = new CouponVO();
		CouponVO couponVO1 = new CouponVO();
		couponVO.setCouponId(1L);
		couponVO.setImageUrl("url");
		couponVO.setName("nihao");
		couponVO1.setCouponId(1L);
		couponVO1.setImageUrl("url");
		couponVO1.setName("nihao");
		List<CouponVO> list = new ArrayList<CouponVO>();
		list.add(couponVO);
		list.add(couponVO1);
		couponList.setData(list);
		System.err.println(JSON.toJSONString(couponList));
	}
}
