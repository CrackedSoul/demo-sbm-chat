package com.victor.demosbmchat.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.victor.demosbmchat.domain.Message;
import com.victor.demosbmchat.service.MessageService;
@RestController
public class MessageController {
	 	private final MessageService messageService;

	    @Autowired
	    public MessageController(MessageService messageService) {
	        this.messageService = messageService;
	    }
	    @PostMapping(value = "/addMessage")
	    public void addMessage(@RequestBody Message message) {
	    	messageService.addMessage(message);	       
	    }
	    @GetMapping(value = "/getAllMessage/{idTo}")
	    public List<Message> getAllMessage(@PathVariable int idTo) {
	        return  messageService.receiveAll(idTo);
	    }
	    @GetMapping(value = "/getMessageFrom/{idFrom}/{idTo}")
	    public List<Message> getAllUser(@PathVariable int idFrom,@PathVariable int idTo) {
	        return  messageService.receiveFrom(idFrom, idTo);
	    }
}
