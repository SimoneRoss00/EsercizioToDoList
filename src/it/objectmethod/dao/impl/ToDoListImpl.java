package it.objectmethod.dao.impl;

import java.util.List;

import it.objectmethod.dao.IToDoList;
import it.objectmethod.model.ToDoListElement;

public class ToDoListImpl implements IToDoList {

	@Override
	public List<ToDoListElement> listOfValue(String name, List<ToDoListElement> l) {
		ToDoListElement tl = new ToDoListElement();
		tl.setValues(name);
		l.add(tl);
		int id = 0;
		for (ToDoListElement i : l) {
			i.setId(id++);
		}
		return l;
	}

	@Override
	public List<ToDoListElement> deleteListOfValue(int idvalue, List<ToDoListElement> l) {
		l.remove(idvalue);
		int id = 0;
		for (ToDoListElement i : l) {
			i.setId(id++);
		}
		return l;
	}

	@Override
	public List<ToDoListElement> statusOfValue(int id,List<ToDoListElement> l) {
		l.get(id).setDone(true);
		return l;
	}
	@Override
	public ToDoListElement findElemnt(String name, List<ToDoListElement> l) {
		for (ToDoListElement toDo : l) {
			if (toDo.getValues().equals(name)) {
				return toDo;
			}
			
		}
		return null;
	}
	



}
