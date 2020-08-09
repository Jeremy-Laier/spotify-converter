package models.error

final case class PlaylistNotFound(
                                   private val message: String = "Playlist was not found",
                                   private val cause: Throwable = None.orNull)
  extends Exception(message, cause)
