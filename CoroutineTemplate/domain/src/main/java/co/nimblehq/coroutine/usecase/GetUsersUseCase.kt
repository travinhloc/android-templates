package co.nimblehq.coroutine.usecase

import co.nimblehq.coroutine.response.toUsers
import co.nimblehq.coroutine.repository.UserRepository
import co.nimblehq.coroutine.model.User
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend fun execute(): UseCaseResult<List<User>> {
        return try {
            val response = userRepository.getUsers()
            UseCaseResult.Success(response.toUsers())
        } catch (e: Exception) {
            UseCaseResult.Error(e)
        }
    }
}
