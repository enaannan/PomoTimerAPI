package com.example.pomodorotimer

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    PomodorotimerServer.stream[IO].compile.drain.as(ExitCode.Success)
}
