package haha;

import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

public class test {

	public static void main(String[] args) {
/*	String json = "{\"name\":\"zhangsan\",\"age\":\"13\",\"address\":\"beijing\"}";
	Student parseObject = JSON.parseObject(json, Student.class);
	System.out.println(parseObject.toString());*/
	/*	Student student = new Student();
		Address address = new Address();
		address.setFanghao("5");
		address.setJiedao("er");
		address.setMenpai("44");
		Address address1 = new Address();
		address1.setFanghao("51");
		address1.setJiedao("er1");
		address1.setMenpai("441");
		ArrayList<Address> arrayList = new ArrayList<Address>();
		arrayList.add(address);
		arrayList.add(address1);
		AddressList addressList = new AddressList();
		addressList.setData(arrayList);
		student.setAddress(addressList);
		System.out.println(JSON.toJSONString(student));*/
	/*	String json = "{\"address\":{\"data\":[{\"fanghao\":\"5\",\"jiedao\":\"er\",\"menpai\":\"44\"},{\"fanghao\":\"51\",\"jiedao\":\"er1\",\"menpai\":\"441\"}]},\"age\":\"25\",\"name\":\"ÆîÎ°Ïé\"}";
		Student parseObject = JSON.parseObject(json, Student.class);
		System.out.println(parseObject.getAddress());
		AddressList parseObject2 = JSON.parseObject(JSON.toJSONString(parseObject.getAddress()), AddressList.class);
		parseObject.setAddress(parseObject2);
		AddressList address = (AddressList) parseObject.getAddress();*/
	/*	System.out.println(JSON.toJSONString(parseObject.getAddress()));
		AddressList parseObject2 = JSON.parseObject(JSON.toJSONString(parseObject.getAddress()), AddressList.class);
		System.out.println(parseObject2);
		System.out.println(parseObject.toString());*/
		ArrayList<Long> arrayList = new ArrayList<Long>();
		arrayList.add(1265L);
		System.out.println(JSON.toJSONString(arrayList));
	}
}
