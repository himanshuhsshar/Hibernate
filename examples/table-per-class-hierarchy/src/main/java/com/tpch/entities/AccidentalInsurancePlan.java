package com.tpch.entities;

public class AccidentalInsurancePlan extends InsurancePlan {

	/**
	 * 
	 */
	// private static final long serialVersionUID = 5206789611467000216L;
	protected String coverageType;
	protected float disabilityCoveragePercentage;

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public float getDisabilityCoveragePercentage() {
		return disabilityCoveragePercentage;
	}

	public void setDisabilityCoveragePercentage(float disabilityCoveragePercentage) {
		this.disabilityCoveragePercentage = disabilityCoveragePercentage;
	}

	@Override
	public String toString() {
		return "AccidentalInsurancePlan [coverageType=" + coverageType + ", disabilityCoveragePercentage="
				+ disabilityCoveragePercentage + ", insurancePlanNo=" + insurancePlanNo + ", planName=" + planName
				+ ", description=" + description + ", taxSaver=" + taxSaver + ", minInsurredAmount=" + minInsurredAmount
				+ "]";
	}

}
