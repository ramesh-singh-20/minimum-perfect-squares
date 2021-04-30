import com.alphacoder.PerfectSquareUtil
import spock.lang.Specification

class PerfectSquareUtilTest extends Specification{

    def 'Test PerfectSquareUtil | numSquares() | number is 0'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(0)

        then:
        result== 0
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 1'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(1)

        then:
        result== 1
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 3'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(3)

        then:
        result== 3
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 5'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(5)

        then:
        result== 2
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 12'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(12)

        then:
        result== 3
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 25'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(25)

        then:
        result== 1
    }

    def 'Test PerfectSquareUtil | numSquares() | number is 13'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquares(13)

        then:
        result== 2
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 0'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(0)

        then:
        result== 0
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 1'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(1)

        then:
        result== 1
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 3'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(3)

        then:
        result== 3
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 5'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(5)

        then:
        result== 2
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 12'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(12)

        then:
        result== 3
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 25'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(25)

        then:
        result== 1
    }

    def 'Test PerfectSquareUtil | numSquaresDp() | number is 13'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.numSquaresDp(13)

        then:
        result== 2
    }
}
