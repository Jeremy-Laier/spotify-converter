package parser

import com.typesafe.config.Config
import models.error.PlaylistNotFound
import models.music.Song
import zio.{IO, ZIO}

trait Parser {
  def
}

// TODO
class ParserImpl(implicit conf: Config) extends Parser {

}
