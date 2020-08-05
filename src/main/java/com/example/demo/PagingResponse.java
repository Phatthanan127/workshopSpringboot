package com.example.demo;

import java.util.List;

public class PagingResponse {
    private List<UsersResponse> usersResponseList;
    private int page;
    private int itemPerPage;
    
    public PagingResponse(int page, int itemPerPage) {
        this.page = page;
        this.itemPerPage = itemPerPage;
    }



    public void setPage(int page) {
        this.page = page;
    }

    public void setItemPerPage(int itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public List<UsersResponse> getUsersResponseList() {
        return usersResponseList;
    }

    public int getPage() {
        return page;
    }

    public int getItemPerPage() {
        return itemPerPage;
    }


    public void setUsersResponse(List<UsersResponse> usersResponseList) {
        this.usersResponseList = usersResponseList;
    }
}
