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

@WebServlet("/TodoListServlet")
public class TodoListServlet extends HttpServlet {
	List<ToDoListElement> l = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		IToDoList it = new ToDoListImpl();
		String name = req.getParameter("taskvalue");
		l = it.listOfValue(name,l);
		session.setAttribute("sessionList", l);
		req.getRequestDispatcher("pages/index.jsp").forward(req, resp);
	}

}
