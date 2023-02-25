package in.surendra.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Coupon {
	
	@Id
	@Column(name="Coupon_Id")
	private Integer CouponId;
	
	@Column(name="Coupon_Code")
	private  String  CouponCode;
	
	@Column(name="discount_Amount")
	private  double discountAmount;
	
	@Column(name="Exp_Date")
	private Date expirationDate;

}
