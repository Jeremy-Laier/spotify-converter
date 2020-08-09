package parser

import com.typesafe.config.Config
import models.error.PlaylistNotFound
import models.music.Song
import zio.{IO, ZIO}

trait Parser {
}

// TODO

// val songs = doc.select(".track-name").eachText().asScala.toList
// val aristAndAlbum = doc.select(".artists-albums a").eachText().asScala.toList.grouped(2)
class ParserImpl(implicit conf: Config) extends Parser {

}
