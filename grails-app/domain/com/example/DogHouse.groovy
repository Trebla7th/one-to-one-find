package com.example

class DogHouse {

    String size
    Dog dog

    static constraints = {
        dog(nullable: true)
    }

    static mapping = {
        dog column: "the_dog"
    }

    String toString() { size }
}
