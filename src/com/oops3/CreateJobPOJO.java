package com.oops3;

import java.util.Arrays;

public class CreateJobPOJO {
	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private CustomerPOJO customer;
	private CustomerAddressPOJO addrress;
	private CustomerProductPOJO product;
	private ProblemsPOJO[]problems;
	public CreateJobPOJO(int mst_service_location_id, int mst_platform_id, int mst_warrenty_status_id, int mst_oem_id,
			CustomerPOJO customer, CustomerAddressPOJO addrress, CustomerProductPOJO product, ProblemsPOJO[] problems) {
		super();
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.customer = customer;
		this.addrress = addrress;
		this.product = product;
		this.problems = problems;
	}
	@Override
	public String toString() {
		return "CreateJobPOJO [mst_service_location_id=" + mst_service_location_id + ", mst_platform_id="
				+ mst_platform_id + ", mst_warrenty_status_id=" + mst_warrenty_status_id + ", mst_oem_id=" + mst_oem_id
				+ ", customer=" + customer + ", addrress=" + addrress + ", product=" + product + ", problems="
				+ Arrays.toString(problems) + "]";
	}
	
}
