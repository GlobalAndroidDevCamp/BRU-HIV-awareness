package net.lp.hivawareness.domain;

public enum Region {
	subSahraAfrican(0.05), middleEast(0.002), southAsia(0.003), eastAsia(0.001), oceania(0.003), centralAmerica(0.005), caribbean(0.01), easternEurope(0.008), westernEurope(0.002), northAmerica(0.002);
	
	private final double mProb;
	
	Region (double probability){
		mProb = probability;
	}
	
	public double getProbability(){
		return mProb;
	}
}
