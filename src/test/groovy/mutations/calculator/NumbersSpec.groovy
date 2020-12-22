package mutations.calculator

import spock.lang.Specification
import spock.lang.Unroll

class NumbersSpec extends Specification {

    @Unroll
    def "Should return #result given #num"() {
        expect:
        Numbers.isNatural(num) == result

        where:
        num | result
        10  | true
        50  | true
        -10 | false
        -50 | false
    }
}
