import java.io.Writer

import scala.io.Source

@deprecated("repalce it with scala.util.Using", "Scala 2.13")
object Using {
  def apply[A, B](resource: A)(process: A => B)(implicit closer: Closer[A]): B =
    try {
      process(resource)
    } finally {
      closer.close(resource)
    }
}

case class Closer[-A](close: A => Unit)

object Closer {
  implicit val sourceCloser: Closer[Source] = Closer(_.close())
  implicit val writerCloser: Closer[Writer] = Closer(_.close())
}
