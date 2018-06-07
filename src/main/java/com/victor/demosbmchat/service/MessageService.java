package com.victor.demosbmchat.service;

import java.util.List;

import com.victor.demosbmchat.domain.Message;


public interface MessageService {
	List<Message> receiveAll(int idTo);
	List<Message> receiveFrom(int idFrom,int idTo);
	void addMessage(Message message);
	void updateMessage(Message message);
}
