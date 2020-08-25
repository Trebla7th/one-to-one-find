package com.example

class Dog {

    String name

    static belongsTo = [dogHouse: DogHouse]

    static constraints = {
    }

    String toString() { name }
}
