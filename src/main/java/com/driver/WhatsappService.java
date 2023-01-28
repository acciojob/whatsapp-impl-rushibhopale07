package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {

    public String createUser(String name, String mobile) throws Exception {
        //If the mobile number exists in database, throw "User already exists" exception
        //Otherwise, create the user and return "SUCCESS"

        return " ";
    }
    public Group createGroup(List<User> users){ // its Group
        Group G= new Group();
        return G;
    }
    public int createMessage(String content){
        return 0;
    }
    public int sendMessage(Message message, User sender, Group group) throws Exception{

        return 0;
    }
    public String changeAdmin(User approver, User user, Group group) throws Exception{

        return "";
    }
    public int removeUser(User user) throws Exception{
        return 0;
    }
    public String findMessage(Date start, Date end, int K) throws Exception{
        return "";
    }

}
