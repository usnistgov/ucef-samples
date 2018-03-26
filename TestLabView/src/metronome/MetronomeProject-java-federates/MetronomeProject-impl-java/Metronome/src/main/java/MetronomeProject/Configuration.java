package MetronomeProject;

public class Configuration {
	private double starttime;
	private double stoptime;
	private double logicaltimesec;
	private double ignoretil;


	public double getStarttime() {
		return starttime;
	}
	public void setStarttime(double starttime) {
		this.starttime = starttime;
	}
	public double getStoptime() {
		return stoptime;
	}
	public void setStoptime(double stoptime) {
		this.stoptime = stoptime;
	}
	public double getLogicaltimeSec() {
		return logicaltimesec;
	}
	public void setLogicaltimeSec(double logicaltimesec) {
		this.logicaltimesec = logicaltimesec;
	}
	public double getIgnoretil() {
		return ignoretil;
	}
	public void setIgnoretil(double ignoretil) {
		this.ignoretil = ignoretil;
	}

	public Configuration() {
		super();
	}
	
}
