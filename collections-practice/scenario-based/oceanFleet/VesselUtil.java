package oceanFleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	private  List<Vessel> list = new ArrayList<>();
	
	public List<Vessel> getVesselList(){
		return list;
	}
	public void setVesselList(List<Vessel> list) {
		this.list = list;
	}
	// Added vessel to vessel list = Requirement 1
	public void addVesselPerformance(Vessel vessel1) {
		list.add(vessel1);
	}
	// retrieving vessel details by id 
	public Vessel getVesselById(String vesselId) {
		for(Vessel v : list) {
			if(v.getVesselId().equals(vesselId)) {
				 return v ;
			}
		}
		return null;
	}
	// retrieve high performance vessel
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> res = new ArrayList<>();
		double maxSpeed = 0;
		for(Vessel v : list) {
			if(v.getAverageSpeed() > maxSpeed) {
				maxSpeed = v.getAverageSpeed();
			}
		}
		for(Vessel v : list) {
			if(v.getAverageSpeed() == maxSpeed) {
				res.add(v);
			}
		}
		return res;
			
	}
	
	

}
