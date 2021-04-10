package org.tushar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/serve")
public class Serve extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String q = request.getParameter("q");
        PrintWriter out = response.getWriter();

        String responseStr;

        switch (q) {
            case "Name":
                responseStr = "Tushar Sudake";
                break;
            case "Email Address":
                responseStr = "etushar89@gmail.com";
                break;
            case "Years":
                responseStr = "9";
                break;
            case "Position":
                responseStr = "Sr. Software Engineer";
                break;
            case "Degree":
                responseStr = "Master of Science in Computer Science";
                break;
            case "Phone":
                responseStr = "+1-312-937-5015";
                break;
            case "Referrer":
                responseStr = "Andrew R.";
                break;
            case "Resume":
                responseStr = "https://www.linkedin.com/in/etushar89/";
                break;
            case "Source":
                responseStr = "github.com";
                break;
            case "Status":
                responseStr = "Yes";
                break;
            case "Puzzle":
                responseStr = " ABCD\n" +
                        "A=<<<\n" +
                        "B>=<<\n" +
                        "C>>=>\n" +
                        "D>><=";
                break;
            case "Ping":
            default:
                responseStr = "OK";
                break;
        }

        out.write(responseStr);
        out.flush();
    }
}