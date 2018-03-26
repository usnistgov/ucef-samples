package Controller;

public class Configuration {
	private double kp = 1.0; // proportional constant
	private double ki = 1.0; // integral constant
	private double kd = 1.0; // derivative constant
	private double hyst = 1.0; //hysteresis if simple model

	public double getKp() {
		return kp;
	}
	public void setKp(double kp) {
		this.kp = kp;
	}
	public double getKi() {
		return ki;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public double getKd() {
		return kd;
	}
	public void setKd(double kd) {
		this.kd = kd;
	}
	public double getHyst() {
		return hyst;
	}
	public void setHyst(double hyst) {
		this.hyst = hyst;
	}
}
