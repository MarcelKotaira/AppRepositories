package br.com.marcelkotaira.apprepositories.domain

import br.com.marcelkotaira.apprepositories.core.UseCase
import br.com.marcelkotaira.apprepositories.data.model.Repo
import br.com.marcelkotaira.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}