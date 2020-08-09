import com.typesafe.config.Config
import config.SpotifyConfig.getConfig
import org.jsoup.Jsoup
import zio.console.{Console, getStrLn, putStrLn}
import zio.{ExitCode, URIO}

object main extends zio.App {
  def test = {

    val doc = Jsoup.connect("https://open.spotify.com/playlist/7udnHb42u5oTXiQq1SaSU9").get()
  }
  def run(args: List[String]): URIO[Console, ExitCode] = {
    implicit val conf: Config = getConfig()
    logic.exitCode
  }

  val logic =
    for {
      _ <- putStrLn("Hello world")
      name <- getStrLn
      _ <- putStrLn(s"Hello ${name}")
    } yield()
}
