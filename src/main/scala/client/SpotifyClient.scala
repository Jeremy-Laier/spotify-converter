package client

import models.error.PlaylistNotFound
import models.music.{Album, Artist, Song}
import zio.ZIO

trait SpotifyClient {
  def getPlaylist(playListUrl: String): ZIO[Any, PlaylistNotFound, List[Song]]

  def getSongs(unparsedSongs: List[String]): ZIO[Any, PlaylistNotFound, List[Song]]

  def getArtists(unparsedArists: List[String]): ZIO[Any, PlaylistNotFound, List[Artist]]

  def getAlbums(unparsedArtists: List[String]): ZIO[Any, PlaylistNotFound, List[Album]]

}

class SpotifyClientImpl extends SpotifyClient {
  override def getPlaylist(playListUrl: String): ZIO[Any, PlaylistNotFound, List[Song]] = ???

  override def getSongs(unparsedSongs: List[String]): ZIO[Any, PlaylistNotFound, List[Song]] = ???

  override def getArtists(unparsedArists: List[String]): ZIO[Any, PlaylistNotFound, List[Artist]] = ???

  override def getAlbums(unparsedArtists: List[String]): ZIO[Any, PlaylistNotFound, List[Album]] = ???
}

