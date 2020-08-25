package com.example

class CatHouse {

    String size
    static hasOne = [cat:Cat]

    static constraints = {
        cat(nullable: true)
    }


    String toString() { size }
}
