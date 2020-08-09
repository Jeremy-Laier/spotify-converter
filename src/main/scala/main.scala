import zio.console._

object main extends zio.App {

  def run(args: List[String]) = {
    logic.exitCode
  }

  val logic =
    for {
      _ <- putStrLn("Hello world")
      name <- getStrLn
      _ <- putStrLn(s"Hello ${name}")
    } yield()
}
