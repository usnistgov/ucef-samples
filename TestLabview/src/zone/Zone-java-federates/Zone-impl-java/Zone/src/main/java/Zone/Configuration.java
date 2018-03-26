package Zone;

public class Configuration {
	private double uae = 172.0; // Lumped Thermal Resistance W per 'C
	private double tau = 104 * 3600.0; // seconds
	private double houseeffectivearea = 6.84; // M2 exposed to sun
	private double sghc = 0.89; // Solar Heat Gain Coefficient
	private double hpbasepower = 1571.0; // heat pump power base consumption when running (will add temperature component)
	private double solarconversionconstant = 1.0;
	private double tsp = 20.0; // temperature setpoint 'C
	private double del=0.5;	// thermostat hysteresis
	private double plugload=0;	// plugload
	private double solarpaneleffectivearea=0;
	
	public double getUae() {
		return uae;
	}
	public void setUae(double uae) {
		this.uae = uae;
	}
	public double getTau() {
		return tau;
	}
	public void setTau(double tau) {
		this.tau = tau;
	}
	public double getHouseeffectivearea() {
		return houseeffectivearea;
	}
	public void setHouseeffectivearea(double houseeffectivearea) {
		this.houseeffectivearea = houseeffectivearea;
	}
	public double getSghc() {
		return sghc;
	}
	public void setSghc(double sghc) {
		this.sghc = sghc;
	}
	public double getHpbasepower() {
		return hpbasepower;
	}
	public void setHpbasepower(double hpbasepower) {
		this.hpbasepower = hpbasepower;
	}
	public double getSolarconversionconstant() {
		return solarconversionconstant;
	}
	public void setSolarconversionconstant(double solarconversionconstant) {
		this.solarconversionconstant = solarconversionconstant;
	}
	public double getTsp() {
		return tsp;
	}
	public void setTsp(double tsp) {
		this.tsp = tsp;
	}
	public double getDel() {
		return del;
	}
	public void setDel(double del) {
		this.del = del;
	}
	public double getPlugload() {
		return plugload;
	}
	public void setPlugload(double plugload) {
		this.plugload = plugload;
	}
	public double getSolarpaneleffectivearea() {
		return solarpaneleffectivearea;
	}
	public void setSolarpaneleffectivearea(double solarpaneleffectivearea) {
		this.solarpaneleffectivearea = solarpaneleffectivearea;
	}
	
}
