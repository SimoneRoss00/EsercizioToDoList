package it.objectmethod.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.dao.IToDoList;
import it.objectmethod.dao.impl.ToDoListImpl;
import it.objectmethod.model.ToDoListElement;

@WebServlet("/ToDoDelete")
public class ToDoDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<ToDoListElement> l = new ArrayList<>();
		HttpSession hs = req.getSession();
		l = (List<ToDoListElement>) hs.getAttribute("sessionList");
		IToDoList it = new ToDoListImpl();
		int valore = Integer.parseInt(req.getParameter("value"));
		it.deleteListOfValue(valore, l);
		req.getRequestDispatcher("pages/index.jsp").forward(req, resp);
	}

}
