package com.csi.jdkfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private int productId;

	private String productName;

	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}

public class StreamAPIConcept {
	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(121, "MI SMART TV", 345677.89));
		productList.add(new Product(101, "HP LAPTOP", 55555.89));
		productList.add(new Product(111, "APPLE LAPTOP", 50000.00));
		//productList.add(new Product(112, "LENOVO LAPTOP", 433656.89));
		//productList.add(new Product(115, "MI SMART PHONE", 655767.89));

		productList.stream().filter(prod -> prod.getProductPrice() == 345677.89).forEach(System.out::println);

		//System.out.println(productList.size());

		long productCount = productList.stream().collect(Collectors.counting());

		System.out.println("\n Product Count: " + productCount);
	}
}
