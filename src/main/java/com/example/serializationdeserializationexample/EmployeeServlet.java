package com.example.serializationdeserializationexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private static final String FILE_PATH = "employee.ser";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Deserialize Employee
        Employee employee = null;
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            employee = (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (employee != null) {
            response.getWriter().println("Deserialized Employee : " + employee);
        } else {
            response.getWriter().println("No employee found");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Serialize Employee
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String salary = request.getParameter("salary");

        Employee employee = new Employee(name, email, address, salary);

        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        response.getWriter().println("Serialized Employee : " + employee);
    }
}
