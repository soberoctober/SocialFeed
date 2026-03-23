package com.eltex;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User(0, "mscott", "Michael Scott", "userPic");
        userService.save(user);

        System.out.println(user.getId());  // Post[content=, author=Anonymous, likes=1]
    }
}

