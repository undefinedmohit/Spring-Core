package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int id;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Question qId;
	
	public Question getqId() {
		return qId;
	}
	public void setqId(Question qId) {
		this.qId = qId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
