package com.webmaster.vaadindemos;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.webmaster.vaadindemos.rest.User;

@Route("")
public class UserList extends VerticalLayout {
    public UserList(UsersService service) {
        var grid = new Grid<User>(User.class);
        grid.setItems(service.getUsers());
        grid.setColumns("name","phone");
        add(grid);
    }
}
