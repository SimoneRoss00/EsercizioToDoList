package it.objectmethod.model;

import java.util.List;

public class ToDoListElement {
	
	private int id;
	
	private String values;
	
	private boolean done;

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}
	
	@Override
	public String toString() {
		return id+" "+values+" "+done;
	}
	


	
}
