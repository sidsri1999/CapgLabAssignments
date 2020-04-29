package com.tea.dto;

public class TrainingInfo {
	private int trainingId;
	private String trainingName;
	private int availableSeats;
	public TrainingInfo(int trainingId, String trainingName, int availableSeats) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.availableSeats = availableSeats;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
}
