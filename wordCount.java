package com.codsoft;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Servlet implementation class wordCount
 */
@WebServlet("/wordCount")
@MultipartConfig
public class wordCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String line;
		    int count=0;
		 	// Check if the request is a file upload
		    if (request.getMethod().equalsIgnoreCase("post")) {
		        Part filePart = request.getPart("file");
		        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
		        InputStream fileContent = filePart.getInputStream();
	
		     // Count words in the uploaded file
	            int wordCount = 0;
	            try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileContent))) {
	                
	                while ((line = reader.readLine()) != null) {
	                    String[] words = line.split("\\s+");
	                    wordCount += words.length;
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            PrintWriter out=response.getWriter();
	    		out.print("hello");
	    		out.println("Number of words present in given file: "+wordCount); 
	    		out.println("<p><a href=\"uploadFile.jsp\">Upload Another File</a></p>");
		
	    }
	}

}
