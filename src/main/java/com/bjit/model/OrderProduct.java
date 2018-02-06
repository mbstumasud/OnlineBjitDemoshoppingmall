package com.bjit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="order_product")
public class OrderProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="order_id", unique=true, nullable=false)
	@GenericGenerator(name="gen", strategy="foreign", parameters={ 
			@Parameter(name="property", value="order")
	})
	private int orderId;
	
	@Column(name="product_id", unique=true, nullable=false)
	@GenericGenerator(name="gen", strategy="foreign", parameters={ 
			@Parameter(name="property", value="product")
	})
	private int productId;
	
	@Column(name="unit_price")
	private int unitPrice;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="attribute_id", unique=true, nullable=false)
	@GenericGenerator(name="gen", strategy="foreign", parameters={ 
			@Parameter(name="property", value="attribute")
	})
	private int attributeId;
	
	@Column(name="attributeItem", unique=true, nullable=false)
	@GenericGenerator(name="gen", strategy="foreign", parameters={ 
			@Parameter(name="property", value="attributeItem")
	})
	private int attributeItemId;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Order order;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Product product;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Attributes attributes;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private AttributesItem attributesItem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public int getAttributeItemId() {
		return attributeItemId;
	}

	public void setAttributeItemId(int attributeItemId) {
		this.attributeItemId = attributeItemId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public AttributesItem getAttributesItem() {
		return attributesItem;
	}

	public void setAttributesItem(AttributesItem attributesItem) {
		this.attributesItem = attributesItem;
	}
	
	
}
