package co.nimblehq.coroutine.model


data class UserUiModel(
    val id: Int,
    val name: String,
    val username: String,
    val phone: String
)

private fun User.toUserUiModel(): UserUiModel =
    UserUiModel(id = id ?: 0, name = name, username = username, phone = phone)

fun List<User>.toUserUiModelList(): List<UserUiModel> {
    return this.map { it.toUserUiModel() }
}
