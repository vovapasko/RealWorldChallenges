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

        @Test
        fun `test basic anagram detection`() {
            val result = groupSimilarTitles("dule")
            assertEquals("duel", result)
        }


        @Test
        fun `test empty input title`() {
            val result = groupSimilarTitles("")
            assertNull(result)
        }

        @Test
        fun `test different word lengths`() {
            val result = groupSimilarTitles("ecrsa")
            assertNull(result)
        }

        @Test
        fun `test swapped characters`() {
            val result = groupSimilarTitles("edul")
            assertEquals("duel", result)
        }

        @Test
        fun `test multiple matches with same character sum`() {
            val result = groupSimilarTitles("whele")
            assertEquals("wheel", result)
        }

        @Test
        fun `test matching anagrams with multiple words in word bank`() {
            val result = groupSimilarTitles("lweeh")
            assertEquals("wheel", result)
        }

        @Test
        fun `test matching anagrams with case-insensitive comparison`() {
            val result = groupSimilarTitles("dUeL")
            assertEquals("duel", result)
        }
    }


}