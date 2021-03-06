package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})
public class GithubersServlet extends HttpServlet {

        @Inject GithubersService githubersService;

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String login = request.getParameter("login");
            if (login != null) {
                try {
                    githubersService.track(login);
                }catch(NullPointerException e) {
                    e.printStackTrace();
                }
            }
            request.setAttribute("githubers", githubersService.getAllGithubers());
            getServletContext().getRequestDispatcher("/githubers.jsp" ).forward( request, response );
        }
}

