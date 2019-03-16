package com.via.dao;

import com.via.dto.VehicleBeans;

public interface IVehicleDAO {
	VehicleBeans register(VehicleBeans beans);
    String validityCheck(VehicleBeans beans);

}
