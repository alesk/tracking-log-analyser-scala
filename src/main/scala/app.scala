import scala.util.parsing.json._
import scala.io.Source

object App {
  def main(args: Array[String]) {
    val fileName = args(0)

    // each JSON record is in one line
    lazy val parsed = for {
      raw <- Source.fromFile(fileName).getLines()
      parsed <- JSON.parseFull(raw) 
    } yield parsed

    // prints each log record
    while(parsed.hasNext)
      println(parsed.next)

  }  
}
