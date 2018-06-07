package com.victor.demosbmchat.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.victor.demosbmchat.domain.Message;

@Mapper
public interface MessageMapper {
	@Select("select * from t_message where messageFrom=#{idFrom} and messageTo=#{idTo} and messageStatus='S' order by messageTime")
    List<Message> retrieveMessage(int idFrom,int idTo);
	
	@Select("select * from t_message where  messageTo=#{idTo} and messageStatus='S' order by messageTime")
    List<Message> retrieveAllMessage(int idTo);

	@Insert("INSERT INTO t_message(messageFrom,messageTo,messageInfo,messageStatus) VALUES(#{messageFrom},"
           + "#{messageTo},#{messageInfo},#{messageStatus})")
    void addMessage(Message message);
   
	@Update("update t_message set messageStatus=#{messageStatus} where messageId=#{messageId}")
	void updateMessageStatus(Message message);
}
