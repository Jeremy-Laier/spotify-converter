package models.music

case class Song(name: String, album: Album, artist: Artist, runtime: Option[Runtime])
