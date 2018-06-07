package com.victor.demosbmchat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.demosbmchat.Mapper.MessageMapper;
import com.victor.demosbmchat.domain.Message;
import com.victor.demosbmchat.service.MessageService;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService {

	private final MessageMapper messageMapper;

    @Autowired
    public MessageServiceImpl(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }
	@Override
	public List<Message> receiveAll(int idTo) {
		return this.messageMapper.retrieveAllMessage(idTo);
	}

	@Override
	public List<Message> receiveFrom(int idFrom, int idTo) {
		return this.messageMapper.retrieveMessage(idFrom, idTo);
	}

	@Override
	public void addMessage(Message message) {		
		this.messageMapper.addMessage(message);
	}

	@Override
	public void updateMessage(Message message) {
		this.messageMapper.updateMessageStatus(message);
	}

}
