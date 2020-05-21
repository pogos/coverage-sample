package pl.pogos.coverage

import spock.lang.Specification

class SumCalculatorSpec extends Specification {
    private SumCalculator calculator = new SumCalculator()

    def "should add two numbers"() {
        when:
        def result = calculator.add(a, b)

        then:
        result.doubleValue() == res.doubleValue()

        where:
        a  || b  || res
        1.0 | 2.0 | 3.0

    }

    def "should execute"() {
        expect:
        1 == 1
    }
}
