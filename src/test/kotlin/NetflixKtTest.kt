import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class NetflixKtTest{

    @Test
    fun testCalculateSum() {
        // Given
        val a = 5
        val b = 10

        // When
        val result = calculateSum(a, b)

        // Then
        assertEquals(15, result)
    }
}