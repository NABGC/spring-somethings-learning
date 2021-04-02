package com.nabgc.akkahttp.base;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.japi.pf.FI;
import com.nabgc.akkahttp.service.UserMessages;
import com.nabgc.akkahttp.service.UserService;

public class UserActor extends AbstractActor {

    private UserService userService = new UserService();

    public static Props props() {
        return Props.create(UserActor.class);
    }

    @Override
    public Receive createReceive() {
        return null;
    }

    private FI.UnitApply<UserMessages.CreateUserMessages> handleCreateUser(){
        return createUserMessages -> {
            userService.createUser(createUserMessages.getUser());
            sender().tell(new UserMessages.ActionPerformed(String.format("User %s created.", createUserMessages.getUser()
                    .getName())), getSelf());
        };
    }

    private FI.UnitApply< UserMessages.GetUserMessages > handleGetUser() {
        return getUserMessages -> {
            sender().tell(userService.getUser(getUserMessages.getUserId()), getSelf());
        };
    }
}
