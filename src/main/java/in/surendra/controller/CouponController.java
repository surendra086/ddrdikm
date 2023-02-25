package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import in.surendra.entity.Coupon;
import in.surendra.service.CouponService;

@RestController
public class CouponController {
	
	@Autowired
	private CouponService couponService;
	
	@PostMapping("/coupon")
	public Coupon saveCoupon(@RequestBody Coupon coupon){
		
		return couponService.saveCoupon(coupon);

   }
}
