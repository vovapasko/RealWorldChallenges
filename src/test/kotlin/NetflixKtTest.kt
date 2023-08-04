import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import kotlin.test.Test

class NetflixKtTest {

    @Nested
    inner class GroupSimilarTitlesTests {
        @Test
        fun `test groupSimilarTitles`() {
            val given = "spede"
            val expected = "speed"
            val actual = groupSimilarTitles(given)
            assertEquals(expected, actual)
        }

        @Test
        fun `test groupSimilarTitles key not found`() {
            val given = "speeede"
            val expected = null
            val actual = groupSimilarTitles(given)
            assertEquals(expected, actual)
        }

    }


}