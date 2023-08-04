import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class NetflixKtTest{

    @Test
    fun `test groupSimilarTitles`(){
        val given = "spede"
        val expected = "speed"
        val actual = groupSimilarTitles(given)
        assertEquals(expected, actual)
    }

}