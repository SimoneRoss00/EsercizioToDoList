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

@WebServlet("/ToDoDone")
public class ToDoDone extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ToDoListElement> l = new ArrayList<>();
		HttpSession hs = request.getSession();
		l = (List<ToDoListElement>) hs.getAttribute("sessionList");
		IToDoList it = new ToDoListImpl();
		int valore = Integer.parseInt(request.getParameter("value"));
        it.statusOfValue(valore, l);
		request.getRequestDispatcher("pages/index.jsp").forward(request, response);
	}

}
