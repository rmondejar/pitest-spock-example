package mutations.calculator

import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.Subject

class NumbersSpec extends Specification {

    @Subject
    Numbers numbers = new Numbers()

    @Unroll
    def "Should return #result given #num"() {
        expect:
        numbers.isNatural(num) == result

        where:
        num | result
        0  | true
        50  | true
        -10 | false
        -50 | false
    }
}