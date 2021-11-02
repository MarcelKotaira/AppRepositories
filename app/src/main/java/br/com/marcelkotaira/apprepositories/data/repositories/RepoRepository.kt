package br.com.marcelkotaira.apprepositories.data.repositories

import br.com.marcelkotaira.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}