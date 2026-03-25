package com.eltex;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();
    private long nextId = 1; //

    public void save(final @NotNull User user) {
        if (user.getId() == 0) {
            user.setId(nextId++);
            users.add(user);
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId() == user.getId()) {
                    users.set(i, user);
                    return;
                }
            }
            users.add(user);
        }
    }

    public void removeById(final long userId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                users.remove(i);
                return;
            }
        }
    }

    public User getById(final long userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        throw new NotFoundException(userId);
    }

    public List<User> getAll() {
        return new ArrayList<>(users);
    }
}
