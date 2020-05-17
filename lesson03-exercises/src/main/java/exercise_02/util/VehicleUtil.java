package exercise_02.util;

import java.awt.List;
import java.util.ArrayList;

import exercise_02.bean.Vehicle;

public class VehicleUtil {
	ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	
	public ArrayList<Vehicle> appenArrayList(Vehicle vehicle) {
		list.add(vehicle);
		return list;
	}

	public void expostTax() {
		for (Vehicle vehicle : list)
			System.out.println(vehicle.toString());
	}
}
