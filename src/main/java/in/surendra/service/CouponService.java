package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Coupon;
import in.surendra.repo.CouponRepo;

@Service
public class CouponService {
	
	@Autowired
	CouponRepo couponRepo;
	
	public Coupon saveCoupon(Coupon coupon) {
		return couponRepo.save(coupon);
	}

}
