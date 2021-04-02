package com.nabgc.akkahttp.service;

import com.nabgc.akkahttp.entity.User;

import java.io.Serializable;

public interface UserMessages {

    class ActionPerformed implements Serializable {

        private static final long serialVersionUID = 1L;

        private final String description;

        public ActionPerformed(String description){
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    class CreateUserMessages implements Serializable {

        private static final long serialVersionUID = 1L;

        private final User user;

        public CreateUserMessages(User user) {
            this.user = user;
        }

        public User getUser() {
            return user;
        }
    }

    class GetUserMessages implements Serializable {

        private static final long serialVersionUID = 1L;

        private final Long userId;

        public GetUserMessages(Long userId){
            this.userId = userId;
        }

        public Long getUserId() {
            return userId;
        }
    }
}
