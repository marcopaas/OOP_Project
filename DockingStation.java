package project;
import java.util.ArrayList;

public abstract class DockingStation {
	private int id;
	private Location gps;
	private boolean onService;
	private ArrayList<ParkingSlot> slot;
	private Terminal terminal;
	private int numberReturns;
	private int numberRents;
	
	public DockingStation(int id, Location gps, boolean onService, ArrayList<ParkingSlot> slot, Terminal terminal,
			int numberReturns, int numberRents) {
		super();
		this.id = id;
		this.gps = gps;
		this.onService = onService;
		this.slot = slot;
		this.terminal = terminal;
		this.numberReturns = numberReturns;
		this.numberRents = numberRents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getGps() {
		return gps;
	}

	public void setGps(Location gps) {
		this.gps = gps;
	}

	public ArrayList<ParkingSlot> getSlot() {
		return slot;
	}

	public void setSlot(ArrayList<ParkingSlot> slot) {
		this.slot = slot;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public int getNumberReturns() {
		return numberReturns;
	}

	public void setNumberReturns(int numberReturns) {
		this.numberReturns = numberReturns;
	}

	public int getNumberRents() {
		return numberRents;
	}

	public void setNumberRents(int numberRents) {
		this.numberRents = numberRents;
	}

	public void setOnService(boolean onService) {
		this.onService = onService;
	}
	
	public boolean isOnService() {
		return onService;
	}
}
