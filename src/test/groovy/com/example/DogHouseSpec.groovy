package com.example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DogHouseSpec extends Specification implements DomainUnitTest<DogHouse> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
