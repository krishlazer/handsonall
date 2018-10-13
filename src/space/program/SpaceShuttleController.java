package space.program;

public class SpaceShuttleController 
{

	
	private SpaceShuttleFacade ssf;
	
	public ShuttleData setShuttleDTO (SpaceShuttle ss)
	{
		
		ShuttleData sd1 = new ShuttleData();
		
		
		sd1.setShuttleID(ss.getShuttleID());
		sd1.setShuttleName(ss.getShuttleName());
		sd1.setAssembledStation(ss.getAssembledStation());
		sd1.setOccupantCapacity(ss.getOccupantsCapacity());
		sd1.setFuelCapacity(ss.getFuelCapacity());
		sd1.setFuelType(ss.getFuelType());
		sd1.setCommander(ss.getCommander());
		sd1.setAsstCommander(ss.getAsstCommander());
		sd1.setSpaceScientist(ss.getSpaceScientist());
		sd1.setPayload(ss.getPayload());
	
		return sd1;
	
	}

	


}
