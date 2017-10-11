package com.example.todofragments;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ebbi on 11/10/2017.
 */

public class Todo {

    private UUID mTodoId;
    private String mTodo;
    private String mTodoDetail;
    private Date mTodoDate;
    private boolean mTodoComplete;

    public Todo() {
        mTodoId = UUID.randomUUID();
        mTodoDate = new Date();
    }

    public void setTodoComplete(boolean todoComplete) {
        mTodoComplete = todoComplete;
    }

    public boolean isTodoComplete() {

        return mTodoComplete;
    }

    public UUID getTodoId() {
        return mTodoId;
    }

    public String getTodo() {
        return mTodo;
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

    public void setTodo(String todo) {
        mTodo = todo;
    }

    public void setTodoDetail(String todoDetail) {
        mTodoDetail = todoDetail;
    }

    public void setTodoDate(Date todoDate) {
        mTodoDate = todoDate;
    }
}
