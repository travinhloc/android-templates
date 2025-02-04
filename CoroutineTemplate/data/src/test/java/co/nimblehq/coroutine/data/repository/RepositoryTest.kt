package co.nimblehq.coroutine.data.repository

import co.nimblehq.coroutine.data.response.Response
import co.nimblehq.coroutine.data.response.toModels
import co.nimblehq.coroutine.data.service.ApiService
import co.nimblehq.coroutine.domain.repository.Repository
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class RepositoryTest {

    private lateinit var mockService: ApiService
    private lateinit var repository: Repository

    private val response = Response(id = 1)

    @Before
    fun setup() {
        mockService = mockk()
        repository = RepositoryImpl(mockService)
    }

    @Test
    fun `When request successful, it returns success`() = runBlockingTest {
        val expected = listOf(response)
        coEvery { mockService.getResponses() } returns expected

        repository.getModels() shouldBe expected.toModels()
    }

    @Test
    fun `When request failed, it returns error`() = runBlockingTest {
        coEvery { mockService.getResponses() } throws Throwable()

        shouldThrow<Throwable> { repository.getModels() }
    }
}
