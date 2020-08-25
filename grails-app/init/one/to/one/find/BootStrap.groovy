package one.to.one.find

import com.example.Cat
import com.example.CatHouse
import com.example.Dog
import com.example.DogHouse

class BootStrap {

    def init = { servletContext ->

        println("\n\nExecuting boot strap")
        Dog.withTransaction {

            DogHouse house = new DogHouse(size: "big").save()
            Dog dog = new Dog(name: "Rover", dogHouse: house).save(flush: true, failOnError: true)

            println("Assigning dog to house")
            house.dog = dog
            house.save(flush: true, failOnError: true)

            println("Created dog: ${dog}")

            CatHouse catHouse = new CatHouse(size: "small").save(flush: true, failOnError: true)
            Cat cat = new Cat(name:"Felix", catHouse: catHouse).save(flush: true, failOnError: true)
            println("Cat created: ${cat}")
        }



    }
    def destroy = {
    }
}
