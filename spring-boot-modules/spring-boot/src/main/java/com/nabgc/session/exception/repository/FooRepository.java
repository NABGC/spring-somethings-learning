package com.nabgc.session.exception.repository;

import com.nabgc.demo.model.Foo;

public interface FooRepository {

    void save(Foo foo);

    Foo get(Integer id);
}
