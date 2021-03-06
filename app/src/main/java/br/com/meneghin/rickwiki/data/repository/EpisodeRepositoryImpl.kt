package br.com.meneghin.rickwiki.data.repository

import br.com.meneghin.rickwiki.data.dto.episode.Episode
import br.com.meneghin.rickwiki.domain.interfaces.EpisodeRepository
import br.com.meneghin.rickwiki.data.network.RickService

class EpisodeRepositoryImpl(private val api: RickService) : EpisodeRepository {

    override suspend fun getEpisodesByPage(page: Int) = api.getEpisodes(page).results

    override suspend fun getEpisode(url: String): Episode? = api.getDetailed(url)

}