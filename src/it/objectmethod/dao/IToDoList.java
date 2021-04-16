package it.objectmethod.dao;

import java.util.List;

import it.objectmethod.model.ToDoListElement;

public interface IToDoList {
	
	public List<ToDoListElement>listOfValue(String name,List<ToDoListElement> l);
	public List<ToDoListElement>deleteListOfValue(int id,List<ToDoListElement> l);
	public List<ToDoListElement> statusOfValue(int id,List<ToDoListElement> l);
	public ToDoListElement findElemnt(String name, List<ToDoListElement> l);
	

}
