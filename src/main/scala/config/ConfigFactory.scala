package config

import com.typesafe.config.{Config, ConfigFactory}

object SpotifyConfig {

  def getConfig(): Config= {
    ConfigFactory.load()
  }
}
