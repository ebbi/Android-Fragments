package com.example.todofragments;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ebbi on 11/10/2017.
 */

public class Todo {

    private UUID mTodoId;
    private String mTodoTitle;
    private String mTodoDetail;
    private Date mTodoDate;
    private boolean mTodoIsComplete;

    public Todo() {
        mTodoId = UUID.randomUUID();
        mTodoDate = new Date();
    }

    public void setTodoIsComplete(boolean todoIsComplete) {
        mTodoIsComplete = todoIsComplete;
    }

    public boolean isTodoIsComplete() {

        return mTodoIsComplete;
    }

    public UUID getTodoId() {
        return mTodoId;
    }

    public String getTodoTitle() {
        return mTodoTitle;
    }

    public String getTodoDetail() {
        return mTodoDetail;
    }

    public Date getTodoDate() {
        return mTodoDate;
    }

    public void setTodoId(UUID todoId) {
        mTodoId = todoId;
    }

    public void setTodoTitle(String todoTitle) {
        mTodoTitle = todoTitle;
    }

    public void setTodoDetail(String todoDetail) {
        mTodoDetail = todoDetail;
    }

    public void setTodoDate(Date todoDate) {
        mTodoDate = todoDate;
    }
}
