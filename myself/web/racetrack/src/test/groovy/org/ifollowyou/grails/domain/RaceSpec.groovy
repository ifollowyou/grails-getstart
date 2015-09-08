package org.ifollowyou.grails.domain

import grails.test.mixin.TestFor
import org.junit.Test
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }

    @Test
    void testInMiles() {
        def race = new Race(distance:5.0)
        assertEquals 3.107, race.inMiles(), 0
    }
}
