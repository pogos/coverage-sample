package pl.pogos.coverage

import spock.lang.Specification

class SimpleFacadeSpec extends Specification {

    def facade = new SimpleFacade()

    def "should multiple numbers"() {
        when:
        def result = facade.multiple(a, b)

        then:
        result.doubleValue() == res.doubleValue()

        where:
        a  || b  || res
        1.0 | 2.0 | 2.0
    }
}
