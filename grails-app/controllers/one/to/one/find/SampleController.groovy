package one.to.one.find

import com.example.Dog
import com.example.DogHouse

class SampleController {

    def index() {
        Dog dog = Dog.list().first()
        DogHouse house = dog.dogHouse

        println("Lookup using FindBy")

        Dog d = Dog.findByDogHouse(house)
        println("Find by house :: ${d}")

        render "Dog: ${dog}, House is ${house}"

    }
}
