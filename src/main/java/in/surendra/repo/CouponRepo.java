package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Coupon;

public interface CouponRepo extends JpaRepository<Coupon,Integer>{
	
	

}
