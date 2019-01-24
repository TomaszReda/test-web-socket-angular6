package com.grokonez.spring.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.grokonez.spring.websocket.model.Response;

@Controller
public class WebController {

	@MessageMapping("/notification")
	@SendTo("/app/notification")
	public Response greeting() throws Exception {
		return new Response("New notification!");
	}
}
