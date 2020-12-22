package mutations.calculator

import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.Subject


class OperationsSpec extends Specification {

    @Subject
    Operations operations = new Operations()

    @Unroll
    def "Should return #result given #num1 + #num2"() {
        expect:
        operations.add(num1, num2) == result

        where:
        num1 | num2 | result
        50   | 0    | 50
        76   | 10   | 86
    }

    @Unroll
    def "Should return #result given #num1 - #num2"() {
        expect:
        operations.subtract(num1, num2) == result

        where:
        num1 | num2 | result
        50   | 0    | 50
        76   | 10   | 66
    }
}