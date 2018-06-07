package com.victor.demosbmchat.domain;

import java.util.Date;

public class Message {
	private Integer messageId;
	private Integer messageFrom;
	private Integer messageTo;
	private String messageInfo;
	private Date messageTime;
	private String messageStatus;	
	
	public Message(Integer messageFrom, Integer messageTo, String messageInfo, Date messageTime, String messageStatus) {
		super();
		this.messageFrom = messageFrom;
		this.messageTo = messageTo;
		this.messageInfo = messageInfo;
		this.messageTime = messageTime;
		this.messageStatus = messageStatus;
	}
	public Message(Integer messageId, Integer messageFrom, Integer messageTo, String messageInfo, Date messageTime,
			String messageStatus) {
		super();
		this.messageId = messageId;
		this.messageFrom = messageFrom;
		this.messageTo = messageTo;
		this.messageInfo = messageInfo;
		this.messageTime = messageTime;
		this.messageStatus = messageStatus;
	}
	public Message() {
		super();
	}
	public Message(Integer messageFrom, Integer messageTo, String messageInfo, String messageStatus) {
		super();
		this.messageFrom = messageFrom;
		this.messageTo = messageTo;
		this.messageInfo = messageInfo;
		this.messageStatus = messageStatus;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", messageFrom=" + messageFrom + ", messageTo=" + messageTo
				+ ", messageInfo=" + messageInfo + ", messageTime=" + messageTime + ", messageStatus=" + messageStatus
				+ "]";
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public Integer getMessageFrom() {
		return messageFrom;
	}
	public void setMessageFrom(Integer messageFrom) {
		this.messageFrom = messageFrom;
	}
	public Integer getMessageTo() {
		return messageTo;
	}
	public void setMessageTo(Integer messageTo) {
		this.messageTo = messageTo;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	public Date getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}
	public String getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}
}
