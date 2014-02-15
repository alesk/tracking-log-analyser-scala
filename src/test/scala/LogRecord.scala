import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck._
import Gen._
import Arbitrary.arbitrary
import DataStructures._


object LogRecordSpecification extends Properties("LogRecord") {


  // Generator for arbitrary LogRecord
  def genLogRecord:Gen[LogRecord] = 
    for {
          sessionId <- arbitrary[Int]
          name <- arbitrary[String]
        } yield LogRecord(sessionId, name)

  /** 
    * 'register' LogRecord generator for implicit use 
    *  Without it teh following error is generated:
    *
    * could not find implicit value for parameter a1: org.scalacheck.Arbitrary[List[DataStructures.LogRecord]]
    *
    * Implicit params in scala:
    *
    *   http://stackoverflow.com/questions/9530893/good-example-of-implicit-parameter-in-scala 
    *   http://daily-scala.blogspot.com/2010/04/implicit-parameters.html
    *
    **/
   implicit lazy val arbLogRecord: Arbitrary[LogRecord] = Arbitrary(genLogRecord) 


  /**
    * Tests Log filter. The remaining LogRecord items must be Set() or contain only
    * names supplied with names parameter.
    */
  property("LogRecordFilter") = forAll { (records: List[LogRecord], names: List[String]) =>
    ((records filter hasName(names)).map (_.name)).toSet.diff(names.toSet) == Set()   }

}
