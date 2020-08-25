package one.to.one.find

import com.example.Cat
import com.example.CatHouse
import com.example.Dog
import com.example.DogHouse

class SampleController {

    def index() {


        Cat cat = Cat.list().first()
        CatHouse catHouse = cat.catHouse
        println("Looked up cat: ${cat} in house ${catHouse}")

        Cat c = Cat.findByCatHouse(catHouse)
        println("Cat found by CatHouse: ${c}")


        Dog dog = Dog.list().first()
        DogHouse house = dog.dogHouse

        println("Lookup using FindBy")

        Dog d = Dog.findByDogHouse(house)
        println("Find by house :: ${d}")

        render "Dog: ${dog}, House is ${house}"

    }
}
