package com.udemy.nelio.secao8.aula69.Exerc3;

public class Student {

	private String name;
	private double score1;
	private double score2;
	private double score3;
	private double mediaScore;
	private double minPass = 60.0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore1() {
		return score1;
	}
	public void setScore1(double score1) {
		this.score1 = score1;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
	public double getScore3() {
		return score3;
	}
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	
	public double mediaScore() {
		mediaScore = (score1 + score2 + score3);
		return mediaScore;
	}
	
	public String passOurFailed() {
		if(mediaScore >= minPass) {
			return "PASS";
		} else {
			return "FAILED" 
					+ "\n" 
					+ "MISSING " 
					+ String.format("%.2f", minPass - mediaScore)
					+ " POINTS";
		}
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + "]";
	}
	
}
