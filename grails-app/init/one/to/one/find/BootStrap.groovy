package one.to.one.find

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

            println("Dog in house")
            println("Created dog: ${dog}")
        }



    }
    def destroy = {
    }
}
