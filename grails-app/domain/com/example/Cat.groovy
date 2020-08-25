package com.example

class Cat {
    String name

    static belongsTo = [catHouse: CatHouse]

    static constraints = {
        catHouse(nullable: true)
    }

    static mapping = {
        catHouse column: 'the_cat_house'
    }

    String toString() { name }
}
