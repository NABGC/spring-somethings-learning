package com.nabgc.springwithgroovy.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.nabgc.springwithgroovy.entity.Todo

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer> {}