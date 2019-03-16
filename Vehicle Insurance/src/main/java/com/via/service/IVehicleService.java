package com.via.service;

import com.via.dto.VehicleBeans;

public interface IVehicleService {
	VehicleBeans register(VehicleBeans beans);
	String validityCheck(VehicleBeans beans);

}
