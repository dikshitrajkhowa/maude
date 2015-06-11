package com.maudeinterface.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class MiAccessDeniedHandler implements AccessDeniedHandler {

	private String accessDeniedUrl;

	@Override
	public void handle(HttpServletRequest request,
			HttpServletResponse response, AccessDeniedException arg2)
			throws IOException, ServletException {

		boolean isAjax = request.getRequestURI().endsWith("json");

		if (isAjax) {

			String jsonObject = "{\"message\":\"You are not authorized to request this resource.\","
					+ "\"accessDenied\":true,\"cause\":\"AUTHORIZATION_FAILURE\"}";
			String contentType = "application/json";
			response.setContentType(contentType);
			PrintWriter out = response.getWriter();
			out.print(jsonObject);
			out.flush();
			out.close();

			return;

		} else {
			
			response.sendRedirect(request.getContextPath() + accessDeniedUrl);
		}

	}

	public String getAccessDeniedUrl() {
		return accessDeniedUrl;
	}

	public void setAccessDeniedUrl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

}

