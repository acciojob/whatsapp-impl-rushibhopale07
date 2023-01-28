package com.driver;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class WhatsappService {
    WhatsappRepository repository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {
        return repository.createUser(name,mobile);
    }
    public Group createGroup(List<User> users){
        return repository.createGroup(users);
    }
    public int sendMassageTogroup(Message message, User sender, Group group) throws Exception {
        return repository.sendMassageTogroup(message,sender,group);
    }
    public String changeAdmin(User approver, User user, Group group) throws Exception {
        return repository.changeAdmin(approver,user,group);
    }
    public int createMessage(String content){
        return repository.createMessage(content);
    }
}