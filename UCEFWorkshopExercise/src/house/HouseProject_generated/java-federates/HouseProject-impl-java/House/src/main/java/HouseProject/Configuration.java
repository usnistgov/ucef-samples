package HouseProject;

public class Configuration {
	
	private int houseid = 1;
	private double UAe = 172.0; // Lumped Thermal Resistance W per 'C
	private double tau = 104 * 3600.0; // seconds
	private double houseEffectiveArea = 6.84; // M2 exposed to sun
	private double sghc = 0.89; // Solar Heat Gain Coefficient
	private double hpBasePower = 1571.0; // heat pump power base consumption when running (will add temperature component)
	private double solarconverionconstant = 1.0;
	private double Tsp = 20.0; // temperature setpoint 'C
	
	public double getUAe() {
		return UAe;
	}

	public void setUAe(double uAe) {
		UAe = uAe;
	}

	public double getTau() {
		return tau;
	}

	public void setTau(double tau) {
		this.tau = tau;
	}

	public double getHouseEffectiveArea() {
		return houseEffectiveArea;
	}

	public void setHouseEffectiveArea(double houseEffectiveArea) {
		this.houseEffectiveArea = houseEffectiveArea;
	}

	public double getSghc() {
		return sghc;
	}

	public void setSghc(double sghc) {
		this.sghc = sghc;
	}

	public double getHpBasePower() {
		return hpBasePower;
	}

	public void setHpBasePower(double hpBasePower) {
		this.hpBasePower = hpBasePower;
	}

	public double getTsp() {
		return Tsp;
	}

	public void setTsp(double tsp) {
		Tsp = tsp;
	}

	
	public double getSolarconverionconstant() {
		return solarconverionconstant;
	}

	public void setSolarconverionconstant(double solarconverionconstant) {
		this.solarconverionconstant = solarconverionconstant;
	}

	public int getHouseid() {
		return houseid;
	}

	public void setHouseid(int houseid) {
		this.houseid = houseid;
	}
}
