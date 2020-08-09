package models

case class Song(name: String, album: Album, artist: Artist, runtime: Option[Runtime])
